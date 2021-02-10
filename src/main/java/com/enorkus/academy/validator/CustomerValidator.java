package com.enorkus.academy.validator;

import com.enorkus.academy.entity.Customer;

public class CustomerValidator {

    public void validate(Customer customer) {
        MandatoryValueValidator mandatoryValueValidator = new MandatoryValueValidator();
        CustomerAdultValidator customerAdultValidator = new CustomerAdultValidator();
        CountryCodeValidator countryCodeValidator = new CountryCodeValidator();
        mandatoryValueValidator.validate(customer.getFirstName(), "First name cannot be blank!");
        mandatoryValueValidator.validate(customer.getLastName(), "Last name cannot be blank!");
        mandatoryValueValidator.validate(customer.getPersonalNumber(), "Personal number cannot be blank!");
        customerAdultValidator.validate(customer.getAge(), "Must be 18 or older to submit!");
        countryCodeValidator.validate(customer.getCountryCode(),"Country code can be blank or it must be one of the following: EE, LV, LT, SE");
    }
}
