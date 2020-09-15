package com.projects.flight.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirPlane {
	
	private Long id;
	private String airPlaneName;
	private Set<AirplaneCompany> airPlaneCOmpany=new HashSet<>();
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
	public Set<AirplaneCompany> getAirPlaneCOmpany() {
		return airPlaneCOmpany;
	}
	public void setAirPlaneCOmpany(Set<AirplaneCompany> airPlaneCOmpany) {
		this.airPlaneCOmpany = airPlaneCOmpany;
	}
	
	
	
}
