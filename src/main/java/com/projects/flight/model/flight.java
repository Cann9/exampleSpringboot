package com.projects.flight.model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class flight
{
	private Long id;
	private double price;
	
	private Date date=new Date();
	
	private Map<String,String> route=new HashMap<>();
	private  AirplaneCompany airPlaneCompany;
	private Set<Ticket> tickets=new HashSet<>();
	
	private int ticketmax=150; 
	
	
	public int getTicketmax() {
		return ticketmax;
	}
	public void setTicketmax(int ticketmax) {
		this.ticketmax = ticketmax;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<String, String> getRoute() {
		return route;
	}
	public void setRoute(Map<String, String> route) {
		this.route = route;
	}
	public AirplaneCompany getAirPlaneCompany() {
		return airPlaneCompany;
	}
	public void setAirPlaneCompany(AirplaneCompany airPlaneCompany) {
		this.airPlaneCompany = airPlaneCompany;
	}
	public Set<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
	

	
	

}
