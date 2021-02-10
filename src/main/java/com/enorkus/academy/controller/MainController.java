package com.enorkus.academy.controller;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.repository.MemoryCustomerRepository;
import com.enorkus.academy.service.CustomerService;
import com.enorkus.academy.validator.CustomerValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private CustomerService customerService;

    public MainController() {
        this.customerService = new CustomerService(new MemoryCustomerRepository(), new CustomerValidator());
    }

    @RequestMapping("/customer/all")
    public List<Customer> fetchCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping("/customer/insert")
    public void insertCustomer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
    }

    @DeleteMapping("/customer/delete/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
        customerService.deleteCustomerById(customerId);
    }
}