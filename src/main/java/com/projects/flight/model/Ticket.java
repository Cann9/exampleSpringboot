package com.projects.flight.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ticket
{
	private Long id;
	private flight flight;
	private Customer customer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public flight getFlight() {
		return flight;
	}
	public void setFlight(flight flight) {
		this.flight = flight;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	
	

}
