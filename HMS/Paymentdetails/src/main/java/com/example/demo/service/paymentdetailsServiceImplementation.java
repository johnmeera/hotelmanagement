package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.paymentdetailsEntity;
import com.example.demo.repo.paymentdetailsRepo;

import java.util.List;

@Service
public class paymentdetailsServiceImplementation implements paymentdetailsService {

    @Autowired
    private paymentdetailsRepo paymentDetailsRepository;

    @Override
    public List<paymentdetailsEntity> getAllPayments() {
        return paymentDetailsRepository.findAll();
    }

    @Override
    public paymentdetailsEntity getPaymentByCustomerId(long customerId) {
        return paymentDetailsRepository.findById(customerId).orElse(null);
    }

    @Override
    public paymentdetailsEntity savePayment(paymentdetailsEntity payment) {
        return paymentDetailsRepository.save(payment);
    }

    @Override
    public void deletePayment(long customerId) {
        paymentDetailsRepository.deleteById(customerId);
    }
}
