package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.customerdetailsEntity;
import com.example.demo.repo.customerdetailsRepo;

import java.util.List;

@Service
public class customerdetailsServiceImplementation implements customerdetailsService {

    @Autowired
    private customerdetailsRepo customerDetailsRepository;

    @Override
    public List<customerdetailsEntity> getAllCustomers() {
        return customerDetailsRepository.findAll();
    }

    @Override
    public customerdetailsEntity getCustomerById(long id) {
        return customerDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public customerdetailsEntity saveCustomer(customerdetailsEntity customer) {
        return customerDetailsRepository.save(customer);
    }

    @Override
    public void deleteCustomer(long id) {
        customerDetailsRepository.deleteById(id);
    }
}
