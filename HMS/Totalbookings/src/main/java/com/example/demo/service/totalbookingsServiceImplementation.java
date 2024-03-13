package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.totalbookingsEntity;
import com.example.demo.repo.totalbookingsRepo;

import java.util.List;

@Service
public class totalbookingsServiceImplementation implements totalbookingsService {

    @Autowired
    private totalbookingsRepo totalBookingsRepository;

    @Override
    public List<totalbookingsEntity> getAllBookings() {
        return totalBookingsRepository.findAll();
    }

    @Override
    public totalbookingsEntity getBookingById(long id) {
        return totalBookingsRepository.findById(id).orElse(null);
    }

    @Override
    public totalbookingsEntity saveBooking(totalbookingsEntity booking) {
        return totalBookingsRepository.save(booking);
    }

    @Override
    public void deleteBooking(long id) {
        totalBookingsRepository.deleteById(id);
    }
}
