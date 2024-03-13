package com.Employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Employee.entity.bookingentity;
import com.Employee.service.bookingservice;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api-v1")
public class bookingcontroller {

    @Autowired
    private bookingservice bookingService;

//    @GetMapping
//    public ResponseEntity<List<bookingentity>> getAllBookings() {
//        List<bookingentity> bookings = bookingService.getAllBookings();
//        return new ResponseEntity<>(bookings, HttpStatus.OK);
//    }
    @GetMapping("/getAll")
    public List<bookingentity> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/booking/{id}")
    public ResponseEntity<bookingentity> getBookingById(@PathVariable long id) {
    	bookingentity booking = bookingService.getBookingById(id);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

//    @PostMapping("/booking/create") 
//    public ResponseEntity<bookingentity> createBooking(@RequestBody bookingentity booking) {
//    	bookingentity createdBooking = bookingService.createBooking(booking);
//        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public bookingentity addbooking(@RequestBody bookingentity bookingentity) {
        return bookingService.createBooking(bookingentity);
    }

    @PutMapping("/booking/{id}")
    public ResponseEntity<bookingentity> updateBooking(@PathVariable long id, @RequestBody bookingentity booking) {
    	bookingentity updatedBooking = bookingService.updateBooking(id, booking);
        return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
    }

    @DeleteMapping("/booking/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable long id) {
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
