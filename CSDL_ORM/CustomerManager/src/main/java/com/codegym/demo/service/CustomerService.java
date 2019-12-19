package com.codegym.demo.service;

import com.codegym.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void  save(Customer customer);
}
