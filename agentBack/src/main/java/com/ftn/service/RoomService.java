package com.ftn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.dto.RoomDTO;
import com.ftn.model.Accomodation;
import com.ftn.model.Room;
import com.ftn.repository.AccomodationRepository;
import com.ftn.repository.RoomRepository;
import com.ftn.soapclient.SOAPConnector;
import com.ftn.webservice.files.GetAccomodationRoomsRequest;
import com.ftn.webservice.files.GetAccomodationRoomsResponse;
import com.ftn.webservice.files.RegisterRoomRequest;
import com.ftn.webservice.files.RegisterRoomResponse;
import com.ftn.webservice.files.RoomSoap;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private AccomodationRepository accomodationRepository;
	
	@Autowired
	private SOAPConnector soapConnector;

	public void createRoom(RoomDTO roomDTO, Long idAccomodation) {
		
		RegisterRoomRequest request = new RegisterRoomRequest();
		String accomodationName = accomodationRepository.getOne(idAccomodation).getName();
		request.setRequest("Agent request: 'Register new room in accomodation '" + accomodationName + "'.");
		request.setAccomodationId(idAccomodation);

		RoomSoap r = new RoomSoap();

	    r.setCapacity(roomDTO.getCapacity());
		r.setActive(false);
		r.setFloor(roomDTO.getFloor());
		r.setReserved(false);
		r.setDay(roomDTO.getDay());
		r.setHasBalcony(roomDTO.isHasBalcony());
		
		request.setRoom(r);

		RegisterRoomResponse response = (RegisterRoomResponse) soapConnector
				.callWebService("https://localhost:8443/ws/accomondation", request);

		//Response poruka sa glavnog back-a
		System.out.println("*****");
		System.out.println(response.getResponse());
		System.out.println("*****");
		
		Room room = new Room();
		
		room.setId(response.getRoomId());
		room.setCapacity(r.getCapacity());
		room.setActive(r.isActive());
		room.setDay(r.getDay());
		room.setFloor(r.getFloor());
		room.setHasBalcony(r.isHasBalcony());
		room.setReserved(r.isReserved());
		
		roomRepository.save(room);
		Accomodation accomodation = accomodationRepository.getOne(idAccomodation);
		List<Room> rooms = accomodation.getRooms();
		rooms.add(room);
		accomodation.setRooms(rooms);
		accomodationRepository.save(accomodation);
		
	}

	public ArrayList<Room> getAllRooms(Long idAccomodation) {
		
		GetAccomodationRoomsRequest request = new GetAccomodationRoomsRequest();
		request.setRequest("Agent request: 'Get all rooms in accomodation '" + accomodationRepository.getOne(idAccomodation).getName() + "'");
		request.setAccomodationId(idAccomodation);
		
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
			r.setDay(response.getRoomslist().get(i).getDay());
			r.setReserved(response.getRoomslist().get(i).isReserved());
			
			rooms.add(r);
			roomRepository.save(r);
			
		}
		

		return (ArrayList<Room>) rooms;
	}
}