package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Dineinn;
import com.hms.repo.DineinnRepo;
@Service
public class DineinnServiceImpl implements DineinnService {
@Autowired
private DineinnRepo dineinnRepo;

	@Override
	public Dineinn save(Dineinn Entity) {
		return dineinnRepo.save(Entity);
	}

	@Override
	public List<Dineinn> getAll() {
		return dineinnRepo.findAll();
	}

}
