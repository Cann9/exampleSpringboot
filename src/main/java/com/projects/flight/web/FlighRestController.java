package com.projects.flight.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projects.flight.model.AirplaneCompany;
import com.projects.flight.service.FlightAppService;

@RestController
@RequestMapping("/flight")
public class FlighRestController 
{
	@Autowired
	private FlightAppService  flightappService;
	
	@RequestMapping(method=RequestMethod.GET,value="/company")
	public ResponseEntity<List<AirplaneCompany>> findCompany()
	{
		
		List<AirplaneCompany> company=flightappService.findAlls();
		
		return ResponseEntity.ok(company);
	}
	

}
