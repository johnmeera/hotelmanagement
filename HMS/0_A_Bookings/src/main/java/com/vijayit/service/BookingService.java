package com.vijayit.service;

import java.util.List;

import com.vijayit.entity.BookingEntity;

public interface BookingService {

	public BookingEntity save(BookingEntity entity);
	
	public List<BookingEntity> getAll();
	
}
