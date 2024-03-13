
package com.Employee.service;



import java.util.List;

import com.Employee.entity.bookingentity;

public interface bookingservice {
    List<bookingentity> getAllBookings();
    bookingentity getBookingById(long id);
    bookingentity createBooking(bookingentity booking);
    bookingentity updateBooking(long id, bookingentity booking);
    void deleteBooking(long id);
}
