package com.kart.customer.controller;

import com.kart.customer.entity.Customer;
import com.kart.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping("/message")
    public String test() {
        return "Hello From Customer";
    }
}
