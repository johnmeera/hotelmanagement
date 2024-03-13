package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Roomservice;
import com.hms.repo.RoomserviceRepo;
@Service
public class RoomServiceImpl implements RoomserviceService {
@Autowired
private RoomserviceRepo roomServiceRepo;

	@Override
	public Roomservice save(Roomservice entity) {
		
		return roomServiceRepo.save(entity);
	}

	@Override
	public List<Roomservice> getAll() {
	
		return roomServiceRepo.findAll();
	}

//	@Override
//	public Roomservice getByName(String customername) {
//		
//		return roomServiceRepo.getByName(customername);
//	}

}
