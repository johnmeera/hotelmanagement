package com.Employee.service;

//import com.example.demo.entity.totalbookingsEntity;
import java.util.List;

import com.Employee.entity.totalbookingsEntity;

public interface totalbookingsService {
    List<totalbookingsEntity> getAllBookings();
    totalbookingsEntity getBookingById(long id);
    totalbookingsEntity saveBooking(totalbookingsEntity booking);
    void deleteBooking(long id);
}
