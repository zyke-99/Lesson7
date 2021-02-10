package com.enorkus.academy.service;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.exception.ValidationException;
import com.enorkus.academy.repository.CustomerRepository;
import com.enorkus.academy.validator.CustomerValidator;
import org.springframework.util.StringUtils;

import java.util.List;

public class CustomerService {

    CustomerRepository customerRepository;
    CustomerValidator customerValidator;

    public CustomerService(CustomerRepository customerRepository, CustomerValidator customerValidator) {
        this.customerRepository = customerRepository;
        this.customerValidator = customerValidator;
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public void insertCustomer(Customer customer) {

        try {
            customerValidator.validate(customer);
            Customer newCustomer = new Customer.CustomerBuilder(
                    StringUtils.capitalize(customer.getFirstName()),
                    StringUtils.capitalize(customer.getLastName()),
                    insertDash(customer.getPersonalNumber())
            )
                    .age(customer.getAge())
                    .city(customer.getCity())
                    .countryCode(customer.getCountryCode())
                    .employer(customer.getEmployer())
                    .gender(customer.getGender())
                    .maritalStatus(customer.getMaritalStatus())
                    .middleName(customer.getMiddleName())
                    .monthlyIncome(customer.getMonthlyIncome())
                    .build();

            customerRepository.insert(newCustomer);

        } catch (ValidationException ex) {
            throw ex;
        }

    }

    public void deleteCustomerById(String customerId) {
        customerRepository.deleteById(customerId);
    }

    private String insertDash(String string) {
        if(string.length()>4) {
            return new StringBuilder(string).insert(4, "-").toString();
        } else { return string; }
    }
}
