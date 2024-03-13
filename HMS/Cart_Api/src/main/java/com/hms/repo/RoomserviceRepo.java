package com.hms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hms.entity.Roomservice;

@Repository
public interface RoomserviceRepo extends JpaRepository<Roomservice, Long> {
    // You can define custom query methods here if needed
	//public Roomservice getByName(String customername);
}
