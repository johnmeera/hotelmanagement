package com.example.demo.service;

import com.example.demo.entity.cancellationsEntity;

import java.util.List;

public interface cancellationsService {
    List<cancellationsEntity> getAllCancellations();
    cancellationsEntity getCancellationById(long id);
    cancellationsEntity saveCancellation(cancellationsEntity cancellation);
    void deleteCancellation(long id);
}
