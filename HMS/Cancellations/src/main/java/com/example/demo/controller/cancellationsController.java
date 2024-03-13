package com.example.demo.controller;

import com.example.demo.entity.cancellationsEntity;
import com.example.demo.service.cancellationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "*")
public class cancellationsController {

    @Autowired
    private cancellationsService cancellationsService;

    @GetMapping
    public List<cancellationsEntity> getAllCancellations() {
        return cancellationsService.getAllCancellations();
    }

    @GetMapping("/{id}")
    public cancellationsEntity getCancellationById(@PathVariable long id) {
        return cancellationsService.getCancellationById(id);
    }

    @PostMapping
    public cancellationsEntity saveCancellation(@RequestBody cancellationsEntity cancellation) {
        return cancellationsService.saveCancellation(cancellation);
    }

    @DeleteMapping("/{id}")
    public void deleteCancellation(@PathVariable long id) {
        cancellationsService.deleteCancellation(id);
    }
}
