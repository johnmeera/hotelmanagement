package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.paymentdetailsEntity;
import com.example.demo.service.paymentdetailsService;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "*")
public class paymentdetailsController {

    @Autowired
    private paymentdetailsService paymentDetailsService;

    @GetMapping
    public List<paymentdetailsEntity> getAllPayments() {
        return paymentDetailsService.getAllPayments();
    }

    @GetMapping("/{customerId}")
    public paymentdetailsEntity getPaymentByCustomerId(@PathVariable long customerId) {
        return paymentDetailsService.getPaymentByCustomerId(customerId);
    }

    @PostMapping
    public paymentdetailsEntity savePayment(@RequestBody paymentdetailsEntity payment) {
        return paymentDetailsService.savePayment(payment);
    }

    @DeleteMapping("/{customerId}")
    public void deletePayment(@PathVariable long customerId) {
        paymentDetailsService.deletePayment(customerId);
    }
}
