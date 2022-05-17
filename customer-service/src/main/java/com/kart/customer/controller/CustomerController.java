package com.kart.customer.controller;

import com.kart.customer.entity.Customer;
import com.kart.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@Slf4j
public class CustomerController {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public Customer save(@RequestBody Customer customer) {
        log.info("Inside save of CustomerController");
        return customerService.save(customer);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        log.info("Inside getAllCustomers of CustomerController");
        return customerService.getAll();
    }

    @GetMapping("/message")
    public String test() {
        log.info("Inside test of CustomerController");
        return "Hello From Customer";
    }
}
