package com.vijayit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijayit.entity.BookingEntity;
import com.vijayit.service.BookingService;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/save")
	 public ResponseEntity<BookingEntity> saveBooking(@RequestBody BookingEntity entity) {
	  BookingEntity savedBooking = bookingService.save(entity);
	   return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
	    }

	    @GetMapping("/getall")
	    public ResponseEntity<List<BookingEntity>> getAllBookings() {
	     List<BookingEntity> bookings = bookingService.getAll();
	     return new ResponseEntity<>(bookings, HttpStatus.OK);
	    }
}
