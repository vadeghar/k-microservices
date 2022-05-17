package com.kart.customer.service;

import com.kart.customer.dao.CustomerDAO;
import com.kart.customer.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {
    private CustomerDAO repository;
    public CustomerService(CustomerDAO repository) {
        this.repository = repository;
    }

    public List<Customer> getAll() {
        log.info("Inside getAll of CustomerService");
        return repository.findAll();
    }
    public Customer save(Customer customer) {
        log.info("Inside save of CustomerService");
        return repository.save(customer);
    }
}
