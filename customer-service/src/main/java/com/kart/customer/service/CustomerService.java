package com.kart.customer.service;

import com.kart.customer.dao.CustomerDAO;
import com.kart.customer.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerDAO repository;
    public CustomerService(CustomerDAO repository) {
        this.repository = repository;
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }
    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}
