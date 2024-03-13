package com.example.demo.service;

import com.example.demo.entity.cancellationsEntity;
import com.example.demo.repo.cancellationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class cancellationsServiceImplementation implements cancellationsService {

    @Autowired
    private cancellationsRepo cancellationsRepository;

    @Override
    public List<cancellationsEntity> getAllCancellations() {
        return cancellationsRepository.findAll();
    }

    @Override
    public cancellationsEntity getCancellationById(long id) {
        Optional<cancellationsEntity> optionalCancellation = cancellationsRepository.findById(id);
        return optionalCancellation.orElse(null);
    }

    @Override
    public cancellationsEntity saveCancellation(cancellationsEntity cancellation) {
        return cancellationsRepository.save(cancellation);
    }

    @Override
    public void deleteCancellation(long id) {
        cancellationsRepository.deleteById(id);
    }
}
