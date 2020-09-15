package com.projects.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.flight.dao.AirPlaneCompanyRepository;
import com.projects.flight.dao.AirPlaneRepository;
import com.projects.flight.model.AirPlane;
import com.projects.flight.model.AirplaneCompany;
@Service
public class FlightAppServiceImpl implements FlightAppService {

	private AirPlaneRepository airplaneRepository;
	
	private AirPlaneCompanyRepository airpalnecompanyrepository;
	
	@Autowired
	public void setAirpalnecompanyrepository(AirPlaneCompanyRepository airpalnecompanyrepository) {
		this.airpalnecompanyrepository = airpalnecompanyrepository;
	}
	
	@Autowired
	public void setAirplaneRepository(AirPlaneRepository airplaneRepository) {
		this.airplaneRepository = airplaneRepository;
	}
	
	@Override
	public List<AirPlane> findAllsAirPlane() {
		
		return airplaneRepository.findAlls();
	}

	@Override
	public List<AirplaneCompany> findAlls() {
		return airpalnecompanyrepository.findAlls();
	}

	@Override
	public void deleteAirPlane(AirPlane airPlane) {
		airplaneRepository.deleteAirPlane(airPlane);

	}

	@Override
	public void addAirPlane(AirPlane airPlane) {
		airplaneRepository.addAirPlane(airPlane);

	}

	@Override
	public void deleteAirplaneCompany(AirplaneCompany airplaneCompany) {
		airpalnecompanyrepository.deleteAirplaneCompany(airplaneCompany);

	}

	@Override
	public void addAirplaneCompany(AirplaneCompany airplaneCompany) {
		airpalnecompanyrepository.addAirplaneCompany(airplaneCompany);

	}

	@Override
	public List<AirplaneCompany> findByCompanyName(String companyName) {
		
		return airpalnecompanyrepository.findByCompanyName(companyName);
	}

}
