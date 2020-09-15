package com.projects.flight.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.projects.flight.dao.AirPlaneCompanyRepository;
import com.projects.flight.model.AirplaneCompany;

@Repository
public class AirPlaneCompanyRespositoryImplMem implements AirPlaneCompanyRepository {
	
	private Map<Long,AirplaneCompany>  companies=new HashMap<>();
	public AirPlaneCompanyRespositoryImplMem() {
		AirplaneCompany airplcom=new AirplaneCompany();
		airplcom.setId(1L);
		airplcom.setCompanyName("pegasus");
		
		AirplaneCompany airplcom2=new AirplaneCompany();
		airplcom.setId(2L);
		airplcom.setCompanyName("THY");
		companies.put(airplcom.getId(),airplcom);
		
		companies.put(airplcom2.getId(),airplcom2);
		
	}
	
	@Override
	public List<AirplaneCompany> findAlls() {
		
		return new ArrayList<>(companies.values());
	}

	@Override
	public void deleteAirplaneCompany(AirplaneCompany airplaneCompany) {
		companies.remove(airplaneCompany.getId());

	}

	@Override
	public void addAirplaneCompany(AirplaneCompany airplaneCompany) {
		companies.put(airplaneCompany.getId(),airplaneCompany);

	}

	@Override
	public List<AirplaneCompany> findByCompanyName(String companyName) {
		
		return companies.values().stream().filter(e->e.getCompanyName().equals(companyName)).collect(Collectors.toList());
	}

	

}
