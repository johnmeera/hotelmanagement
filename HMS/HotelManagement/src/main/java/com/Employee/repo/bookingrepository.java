//package com.example.demo.booking.repo;
//
//public interface bookingrepository {
//
//}
package com.Employee.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.bookingentity;

@Repository
public interface bookingrepository extends JpaRepository<bookingentity, Long> {
    // You can add custom queries or methods here if needed
}
