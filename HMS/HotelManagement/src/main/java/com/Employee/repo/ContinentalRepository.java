package com.Employee.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.ContinentalEntity;

@Repository
public interface ContinentalRepository extends JpaRepository<ContinentalEntity, Long> {
    
}
