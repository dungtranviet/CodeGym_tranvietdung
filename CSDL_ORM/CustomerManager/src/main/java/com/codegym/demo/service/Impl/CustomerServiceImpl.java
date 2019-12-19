package com.codegym.demo.service.Impl;

import com.codegym.demo.model.Customer;
import com.codegym.demo.repository.CustomerRepository;
import com.codegym.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.getAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
