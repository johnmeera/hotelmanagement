package com.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Employee.entity.totalbookingsEntity;
import com.Employee.service.totalbookingsService;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "*")
public class totalbookingsController {

    @Autowired
    private totalbookingsService totalBookingsService;

    @GetMapping
    public List<totalbookingsEntity> getAllBookings() {
        return totalBookingsService.getAllBookings();
    }

    @GetMapping("/{id}")
    public totalbookingsEntity getBookingById(@PathVariable long id) {
        return totalBookingsService.getBookingById(id);
    }

    @PostMapping("/create")
    public totalbookingsEntity saveBooking(@RequestBody totalbookingsEntity booking) {
        return totalBookingsService.saveBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable long id) {
        totalBookingsService.deleteBooking(id);
    }
}

//Nikhil-total bookings
