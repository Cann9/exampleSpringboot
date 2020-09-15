package com.projects.flight.dao;

import java.util.List;

import com.projects.flight.model.AirplaneCompany;

public interface AirPlaneCompanyRepository {
	
	 List<AirplaneCompany> findAlls(); 
	 void deleteAirplaneCompany(AirplaneCompany airplaneCompany);
	 void addAirplaneCompany(AirplaneCompany airplaneCompany);
	
	 List<AirplaneCompany> findByCompanyName(String companyName);
	
	
}
