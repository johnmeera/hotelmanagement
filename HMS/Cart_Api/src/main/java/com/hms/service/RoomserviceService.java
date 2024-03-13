package com.hms.service;

import java.util.List;

import com.hms.entity.Roomservice;

public interface RoomserviceService {
	
 public Roomservice save(Roomservice entity);
 public List<Roomservice> getAll();
 
 //public Roomservice getByName(String customername);

}