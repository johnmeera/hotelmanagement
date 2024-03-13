package com.Employee.repo;

 // Import the MoghulaiEntity instead of ContinentalEntity

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.MoghulaiEntity;

@Repository
public interface MoghulaiRepository extends JpaRepository<MoghulaiEntity, Long> { // Update the class name to MoghulaiRepository
    
}
