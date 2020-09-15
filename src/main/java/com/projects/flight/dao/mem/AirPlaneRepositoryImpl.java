package com.projects.flight.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.projects.flight.dao.AirPlaneRepository;
import com.projects.flight.model.AirPlane;
@Repository
public class AirPlaneRepositoryImpl implements AirPlaneRepository {
	private Map<Long,AirPlane> airplanes=new HashMap<>();
	
	 public AirPlaneRepositoryImpl() {
		 
		AirPlane airpl1=new AirPlane();
		airpl1.setId(1L);
		airpl1.setAirPlaneName("Adnan menderes havalimanı");
		 
		AirPlane airpl2=new AirPlane();
		airpl1.setId(2L);
		airpl1.setAirPlaneName("Adana Şakir Paşa havalimanı");
		
		AirPlane airpl3=new AirPlane();
		airpl1.setId(3L);
		airpl1.setAirPlaneName("Atatürk havalimanı");
		
		AirPlane airpl4=new AirPlane();
		airpl1.setId(4L);
		airpl1.setAirPlaneName("Sabiha gökçen havalimanı");
		 
		airplanes.put(airpl1.getId(),airpl1);
		airplanes.put(airpl2.getId(),airpl2);
		airplanes.put(airpl3.getId(),airpl3);
		airplanes.put(airpl4.getId(),airpl4);
		
	}
	
	@Override
	public List<AirPlane> findAlls() {
		
		return new ArrayList<>(airplanes.values());
	}

	@Override
	public void deleteAirPlane(AirPlane airPlane) {
		airplanes.remove(airPlane.getId());
	}
	@Override
	public void addAirPlane(AirPlane airPlane) {
		airplanes.put(airPlane.getId(),airPlane);

	}

}
