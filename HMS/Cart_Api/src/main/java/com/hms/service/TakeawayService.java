package com.hms.service;

import java.util.List;

import com.hms.entity.Takeaway;

public interface TakeawayService {
	
	public Takeaway save(Takeaway Entity);
	public List<Takeaway> getAll();
}
