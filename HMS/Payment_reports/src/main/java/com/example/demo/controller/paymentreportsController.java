package com.example.demo.controller;

import com.example.demo.entity.paymentreportsEntity;
import com.example.demo.service.paymentreportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api-v1")
public class paymentreportsController {

    @Autowired
    private paymentreportsService paymentReportsService;

    @GetMapping
    public ResponseEntity<List<paymentreportsEntity>> getAllPaymentReports() {
    	return new ResponseEntity<List<paymentreportsEntity>>(paymentReportsService.getAllPaymentReports(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public paymentreportsEntity getPaymentReportById(@PathVariable long id) {
        return paymentReportsService.getPaymentReportById(id);
    }

    @PostMapping("/create")
    public paymentreportsEntity savePaymentReport(@RequestBody paymentreportsEntity paymentReport) {
        return paymentReportsService.savePaymentReport(paymentReport);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentReport(@PathVariable long id) {
        paymentReportsService.deletePaymentReport(id);
    }
}
