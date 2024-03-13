package com.example.demo.service;

import com.example.demo.entity.paymentreportsEntity;
import com.example.demo.repo.paymentreportsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class paymentreportsServiceImplementation implements paymentreportsService {

    @Autowired
    private paymentreportsRepo paymentReportsRepository;

    @Override
    public List<paymentreportsEntity> getAllPaymentReports() {
        return paymentReportsRepository.findAll();
    }

    @Override
    public paymentreportsEntity getPaymentReportById(long id) {
        Optional<paymentreportsEntity> optionalPaymentReport = paymentReportsRepository.findById(id);
        return optionalPaymentReport.orElse(null);
    }

    @Override
    public paymentreportsEntity savePaymentReport(paymentreportsEntity paymentReport) {
        return paymentReportsRepository.save(paymentReport);
    }

    @Override
    public void deletePaymentReport(long id) {
        paymentReportsRepository.deleteById(id);
    }
}
