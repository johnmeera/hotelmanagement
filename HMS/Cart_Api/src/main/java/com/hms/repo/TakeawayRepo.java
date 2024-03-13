package com.hms.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hms.entity.Takeaway;

@Repository
public interface TakeawayRepo extends JpaRepository<Takeaway, Long> {
    // You can define custom query methods here if needed
}
