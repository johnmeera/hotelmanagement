package com.vijayit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijayit.entity.BookingEntity;
import com.vijayit.repo.BookingRepo;
@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo bookRepo;
	
	@Override
	public BookingEntity save(BookingEntity entity) {
		return bookRepo.save(entity);
	}

	@Override
	public List<BookingEntity> getAll() {
		return bookRepo.findAll();
	}

}
