package com.projects.flight.service;

import java.util.List;

import com.projects.flight.model.AirPlane;
import com.projects.flight.model.AirplaneCompany;

public interface FlightAppService
{
	
	List<AirPlane> findAllsAirPlane();
	 List<AirplaneCompany> findAlls(); 
	 List<AirplaneCompany> findByCompanyName(String companyName);
	
	 void deleteAirPlane(AirPlane airPlane);
	 void addAirPlane(AirPlane airPlane);
	
	 void deleteAirplaneCompany(AirplaneCompany airplaneCompany);
	 void addAirplaneCompany(AirplaneCompany airplaneCompany);

}
