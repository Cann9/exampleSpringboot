package com.projects.flight.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirPlane {
	
	private Long id;
	private String airPlaneName;
	private AirplaneCompany airplaneCompany;
	
	
	public AirplaneCompany getAirplaneCompany() {
		return airplaneCompany;
	}
	public void setAirplaneCompany(AirplaneCompany airplaneCompany) {
		this.airplaneCompany = airplaneCompany;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAirPlaneName() {
		return airPlaneName;
	}
	public void setAirPlaneName(String airPlaneName) {
		this.airPlaneName = airPlaneName;
	}

	
	
	
}
