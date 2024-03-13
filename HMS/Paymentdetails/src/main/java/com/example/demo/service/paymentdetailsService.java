package com.example.demo.service;

import com.example.demo.Entity.paymentdetailsEntity;
import java.util.List;

public interface paymentdetailsService {
    List<paymentdetailsEntity> getAllPayments();
    paymentdetailsEntity getPaymentByCustomerId(long customerId);
    paymentdetailsEntity savePayment(paymentdetailsEntity payment);
    void deletePayment(long customerId);
}
