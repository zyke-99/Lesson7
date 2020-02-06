package com.enorkus.academy.controller;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private CustomerRepository repository;

    public MainController() {
        repository = new CustomerRepository();
    }

    @RequestMapping("/customer/all")
    public List<Customer> fetchCustomers() {
        return null;
    }

    @PostMapping("/customer/insert")
    public void insertCustomer(@RequestBody Customer customer) {
    }

    @DeleteMapping("/customer/delete/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
    }
}