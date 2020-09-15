package com.projects.flight.dao;

import java.util.List;

import com.projects.flight.model.AirPlane;

public interface AirPlaneRepository 
{
	
	List<AirPlane> findAlls();
	void deleteAirPlane(AirPlane airPlane);
	void addAirPlane(AirPlane airPlane);
}
