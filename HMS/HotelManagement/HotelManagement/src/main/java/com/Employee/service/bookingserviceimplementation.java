
package com.Employee.service;



//import com.example.demo.booking.repository.bookingrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.bookingentity;
import com.Employee.repo.bookingrepository;

import java.util.List;
import java.util.Optional;

@Service
public class bookingserviceimplementation implements bookingservice {

    @Autowired
    private bookingrepository bookingRepository;

    @Override
    public List<bookingentity> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public bookingentity getBookingById(long id) {
        Optional<bookingentity> optionalBooking = bookingRepository.findById(id);
        return optionalBooking.orElse(null);
    }

    @Override
    public bookingentity createBooking(bookingentity booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public bookingentity updateBooking(long id, bookingentity updatedBooking) {
        if (bookingRepository.existsById(id)) {
            updatedBooking.setCustomerid(id);
            return bookingRepository.save(updatedBooking);
        } else {
            return null; // Handle non-existing booking
        }
    }

    @Override
    public void deleteBooking(long id) {
        bookingRepository.deleteById(id);
    }
}
