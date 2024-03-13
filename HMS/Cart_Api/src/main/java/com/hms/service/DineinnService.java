package com.hms.service;

import java.util.List;

import com.hms.entity.Dineinn;

public interface DineinnService {
  
   public Dineinn save(Dineinn Entity);
	public List<Dineinn> getAll();
}
