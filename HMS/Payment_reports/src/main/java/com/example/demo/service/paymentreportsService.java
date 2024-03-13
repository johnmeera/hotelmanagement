package com.example.demo.service;

import com.example.demo.entity.paymentreportsEntity;
import java.util.List;

public interface paymentreportsService {
    List<paymentreportsEntity> getAllPaymentReports();

    paymentreportsEntity getPaymentReportById(long id);

    paymentreportsEntity savePaymentReport(paymentreportsEntity paymentReport);

    void deletePaymentReport(long id);
}
