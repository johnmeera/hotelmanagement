package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Takeaway;
import com.hms.repo.TakeawayRepo;
@Service
public class TakeawayServiceImpl implements TakeawayService {
@Autowired
private TakeawayRepo takeawayRepo;

	@Override
	public Takeaway save(Takeaway Entity) {
	
		return takeawayRepo.save(Entity);
	}

	@Override
	public List<Takeaway> getAll() {
		
		return takeawayRepo.findAll();
	}

}
