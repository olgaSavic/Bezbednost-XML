package com.ftn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.model.City;
import com.ftn.service.CityService;

@RestController
@RequestMapping(value = "/api/city")
public class CityController {
	private static final Logger log = LoggerFactory.getLogger(CityController.class);

	@Autowired
	private CityService cityService;


	@PreAuthorize("hasAuthority('READ_CITY')")
	@GetMapping("/getAllCities")
	public ResponseEntity<List<City>> getCity() {
		log.info("GETCITY");

		ArrayList<City> cities = (ArrayList<City>) cityService.getAllCities();
		
		return new ResponseEntity<List<City>>(cities, HttpStatus.OK);
	}

}
