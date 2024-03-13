package com.example.demo.repo;

import com.example.demo.entity.cancellationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cancellationsRepo extends JpaRepository<cancellationsEntity, Long> {
}
