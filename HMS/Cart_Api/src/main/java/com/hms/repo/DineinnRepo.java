package com.hms.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hms.entity.Dineinn;

@Repository
public interface DineinnRepo extends JpaRepository<Dineinn, Long> {
    // You can define custom query methods here if needed
}
