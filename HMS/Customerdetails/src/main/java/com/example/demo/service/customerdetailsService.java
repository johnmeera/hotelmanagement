package com.example.demo.service;

import com.example.demo.entity.customerdetailsEntity;
import java.util.List;

public interface customerdetailsService {
    List<customerdetailsEntity> getAllCustomers();
    customerdetailsEntity getCustomerById(long id);
    customerdetailsEntity saveCustomer(customerdetailsEntity customer);
    void deleteCustomer(long id);
}
