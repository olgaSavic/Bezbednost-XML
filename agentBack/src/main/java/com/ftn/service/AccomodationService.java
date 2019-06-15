package com.ftn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.dto.AccomodationDTO;
import com.ftn.model.Accomodation;
import com.ftn.model.AdditionalServices;
import com.ftn.model.Category;
import com.ftn.model.City;
import com.ftn.model.Room;
import com.ftn.model.TypeAccomodation;
import com.ftn.repository.AccomodationRepository;
import com.ftn.repository.AdditionalServicesRepository;
import com.ftn.repository.AgentRepository;
import com.ftn.repository.CategoryRepository;
import com.ftn.repository.CityRepository;
import com.ftn.repository.TypeAccomodationRepository;
import com.ftn.soapclient.SOAPConnector;
import com.ftn.webservice.files.AccomodationSoap;
import com.ftn.webservice.files.AdditionalServicesSoap;
import com.ftn.webservice.files.AgentSoap;
import com.ftn.webservice.files.CategorySoap;
import com.ftn.webservice.files.CitySoap;
import com.ftn.webservice.files.DeleteAccomodationRequest;
import com.ftn.webservice.files.DeleteAccomodationResponse;
import com.ftn.webservice.files.EditAccomodationRequest;
import com.ftn.webservice.files.EditAccomodationResponse;
import com.ftn.webservice.files.GetAccomodationRequest;
import com.ftn.webservice.files.GetAccomodationResponse;
import com.ftn.webservice.files.GetAccomodationRoomsRequest;
import com.ftn.webservice.files.GetAccomodationRoomsResponse;
import com.ftn.webservice.files.GetAllAccomodationsRequest;
import com.ftn.webservice.files.GetAllAccomodationsResponse;
import com.ftn.webservice.files.RegisterAccomodationRequest;
import com.ftn.webservice.files.RegisterAccomodationResponse;
import com.ftn.webservice.files.TypeAccomodationSoap;

@Service
public class AccomodationService {
	
	@Autowired
	private AccomodationRepository accomodationRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private TypeAccomodationRepository typeAccomodationRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private AdditionalServicesRepository additionalServicesRepository;
	@Autowired
	private AgentRepository agentRepository;
	
	@Autowired
	private SOAPConnector soapConnector;

	public Accomodation create(AccomodationDTO accDTO, Long idAgent) {
		
		RegisterAccomodationRequest request = new RegisterAccomodationRequest();
		request.setRequest("Agent request: 'Register new accomodation '" + accDTO.getName() + "'");

		AccomodationSoap a = new AccomodationSoap();

		a.setName(accDTO.getName());
		CitySoap c = new CitySoap();
		c.setName(accDTO.getCity());
		a.setCity(c);
		a.setAddress(accDTO.getAddress());
		TypeAccomodationSoap ta = new TypeAccomodationSoap();
		ta.setName(accDTO.getType());
		a.setTypeAccomodation(ta);
		CategorySoap ca = new CategorySoap();
		ca.setName(accDTO.getCategory());
		a.setCategory(ca);
		a.setDescription(accDTO.getDescription());
		a.setPic(accDTO.getPic());
		a.setAgent(idAgent);
		for(int i=0; i<accDTO.getList().size(); i++) {
			AdditionalServicesSoap ass = new AdditionalServicesSoap();
			ass.setName(accDTO.getList().get(i));
			a.getAdditionalServices().add(ass);
		}

		request.setAccomodation(a);

		RegisterAccomodationResponse response = (RegisterAccomodationResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);

		//Response poruka sa glavnog back-a
		System.out.println("*****");
		System.out.println("Head back response: 'New accomodation is successfully registered'");
		System.out.println("*****");
		
		Accomodation accomodation = new Accomodation();
		
		accomodation.setId(response.getAccomodationId());
		accomodation.setName(a.getName());
		City city = cityRepository.findByName(a.getCity().getName());
		accomodation.setCity(city);
		accomodation.setAddress(a.getAddress());
		TypeAccomodation typeAccomodation = typeAccomodationRepository.findByName(a.getTypeAccomodation().getName());
		accomodation.setTypeAccomodation(typeAccomodation);
		Category category = categoryRepository.findByName(a.getCategory().getName());
		accomodation.setCategory(category);
		accomodation.setDescription(a.getDescription());
		accomodation.setPic(a.getPic());
		accomodation.setAgent(agentRepository.getOne(a.getAgent()));
		List<AdditionalServices> additionalServices = new ArrayList<AdditionalServices>();
		for(int i=0; i<a.getAdditionalServices().size(); i++) {
			AdditionalServices additionalService = additionalServicesRepository.findByName(a.getAdditionalServices().get(i).getName());
			additionalServices.add(additionalService);
		}
		accomodation.setAdditionalServices(additionalServices);
		
		accomodationRepository.save(accomodation);
		
		return accomodation;

	}


	public String delete(Long id) {
		
		DeleteAccomodationRequest request = new DeleteAccomodationRequest();
		request.setDeleteAccomodationId(id);
		
		DeleteAccomodationResponse response = (DeleteAccomodationResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);
		
		System.out.println("Odogovor : " + response.getDeletedAccomodationId());
		
		Accomodation accomodation = accomodationRepository.findOneById(response.getDeletedAccomodationId());
		accomodationRepository.delete(accomodation);
		
		// Ovde treba da se obrise sve sto je vezano za taj smestaj

		return "Accomodation with id " + id + " successfully deleted!";

	}

	public Accomodation edit(Long idAgent, Long id, AccomodationDTO accDTO) {
		
		EditAccomodationRequest request = new EditAccomodationRequest();
		request.setEditAccomodationId(id);
		
		AccomodationSoap a = new AccomodationSoap();

		a.setName(accDTO.getName());
		CitySoap city = new CitySoap();
		city.setName(accDTO.getCity());
		a.setCity(city);
		a.setAddress(accDTO.getAddress());
		TypeAccomodationSoap typeAccomodation = new TypeAccomodationSoap();
		typeAccomodation.setName(accDTO.getType());
		a.setTypeAccomodation(typeAccomodation);
		CategorySoap category = new CategorySoap();
		category.setName(accDTO.getCategory());
		a.setCategory(category);
		a.setDescription(accDTO.getDescription());
		// a.setCapacity(accDTO.getCapacity());
		a.setPic(accDTO.getPic());
		AgentSoap agent = new AgentSoap();
		//Zasto DTO nema polje za agenta?
		//agent.setUsername(accDTO.getA);
		//a.setAgent(value);
		
		request.setEditAccomodationData(a);
		
		
		EditAccomodationResponse response = (EditAccomodationResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);
		
		Accomodation accomodation = accomodationRepository.findOneById(response.getEditedAccomodation().getId());
		
		accomodation.setName(response.getEditedAccomodation().getName());
		accomodation.setAddress(response.getEditedAccomodation().getAddress());
		
		accomodationRepository.save(accomodation);
		
		return accomodation;

	}

	public ArrayList<Accomodation> getAllAccomodation(Long idAgent) {
		
		GetAllAccomodationsRequest request = new GetAllAccomodationsRequest();
		String agentUsername = agentRepository.getOne(idAgent).getUsername();
		request.setRequest("Agent request: 'Return all accomodation added by agent '" + agentUsername + "'");
		request.setAgentId(idAgent);
		
		GetAllAccomodationsResponse response = (GetAllAccomodationsResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);
		
		//Response poruka sa glavnog back-a
		System.out.println("*****");
		System.out.println(response.getResponse());
		System.out.println("*****");
		
		List<Accomodation> accomodations = new ArrayList<Accomodation>();
		
		for(int i = 0; i < response.getAccomodationsList().size(); i++) {
			
			Accomodation a = new Accomodation();
			a.setId(response.getAccomodationsList().get(i).getId());
			a.setName(response.getAccomodationsList().get(i).getName());
			String cityName = response.getAccomodationsList().get(i).getCity().getName();
			a.setCity(cityRepository.findByName(cityName));
			a.setAddress(response.getAccomodationsList().get(i).getAddress());
			String typeAccomodationName = response.getAccomodationsList().get(i).getTypeAccomodation().getName();
			a.setTypeAccomodation(typeAccomodationRepository.findByName(typeAccomodationName));
			String categoryName = response.getAccomodationsList().get(i).getCategory().getName();
			a.setCategory(categoryRepository.findByName(categoryName));
			a.setDescription(response.getAccomodationsList().get(i).getDescription());
			a.setPic(response.getAccomodationsList().get(i).getPic());
			a.setAgent(agentRepository.getOne(idAgent));
			List<AdditionalServices> as = new ArrayList<AdditionalServices>();
			for(int j=0; j<response.getAccomodationsList().get(i).getAdditionalServices().size(); j++) {
				String additionalServiceName = response.getAccomodationsList().get(i).getAdditionalServices().get(j).getName();
				AdditionalServices additonalService = additionalServicesRepository.findByName(additionalServiceName);
				as.add(additonalService);
			}
			a.setAdditionalServices(as);

			accomodationRepository.save(a);
			accomodations.add(a);
			
		}
		

		return (ArrayList<Accomodation>) accomodations;
	}

	public Accomodation getAccomodation(Long id) {
		
		GetAccomodationRequest request = new GetAccomodationRequest();
		request.setRequestedAccomodationId(id);
		
		GetAccomodationResponse response = (GetAccomodationResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);
		
		
		Accomodation accomodation = accomodationRepository.findOneById(response.getReturnedAccomodation().getId());
		
		return accomodation;
	}
	
	public ArrayList<Room> getAllAccomodationRooms(Long id) {
		
		
		GetAccomodationRoomsRequest request = new GetAccomodationRoomsRequest();
		request.setRequest("Agent request: 'Get all rooms in accomodation '" + accomodationRepository.getOne(id).getName() + "'");
		request.setAccomodationId(id);
		
		GetAccomodationRoomsResponse response = (GetAccomodationRoomsResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);
		
		List<Room> rooms = new ArrayList<Room>();
		
		//Response poruka sa glavnog back-a
		System.out.println("*****");
		System.out.println("Head back response: 'Successfully sent list of all rooms in requested accomodation'");
		System.out.println("*****");
		
		for(int i = 0; i < response.getRoomslist().size(); i++) {
			
			Room r = new Room();
			r.setId(response.getRoomslist().get(i).getId());
			r.setCapacity(response.getRoomslist().get(i).getCapacity());
			r.setFloor(response.getRoomslist().get(i).getFloor());
			r.setHasBalcony(response.getRoomslist().get(i).isHasBalcony());
			r.setActive(response.getRoomslist().get(i).isActive());
			
			rooms.add(r);
			
		}
		

		return (ArrayList<Room>) rooms;
	}


}
