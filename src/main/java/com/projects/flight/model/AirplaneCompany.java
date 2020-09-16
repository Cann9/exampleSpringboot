package com.projects.flight.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirplaneCompany 
{
	private Long id;
	private String  CompanyName;
	private Set<AirPlane> airplane=new HashSet<>();
	private Set<flight> flights=new HashSet<>();
	

	
	public Set<AirPlane> getAirplane() {
		return airplane;
	}
	public void setAirplane(Set<AirPlane> airplane) {
		this.airplane = airplane;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	
	public Set<flight> getFlights() {
		return flights;
	}
	public void setFlights(Set<flight> flights) {
		this.flights = flights;
	}
	@Override
	public String toString() {
		return "AirplaneCompany [id=" + id + ", CompanyName=" + CompanyName + "]";
	}
	
	

	

}
