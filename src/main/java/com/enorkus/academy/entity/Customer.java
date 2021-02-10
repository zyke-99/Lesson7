package com.enorkus.academy.entity;


import java.math.BigDecimal;

public class Customer {

    public static class CustomerBuilder {

        //Mandatory
        private String firstName;
        private String lastName;
        private String personalNumber;

        //Optional
        private String middleName;
        private int age;
        private String countryCode;
        private String city;
        private BigDecimal monthlyIncome;
        private String employer;
        private String gender;
        private String maritalStatus;

        public CustomerBuilder(String firstName, String lastName, String personalNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personalNumber = personalNumber;
        }

        public CustomerBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public CustomerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public CustomerBuilder city(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder monthlyIncome(BigDecimal monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
            return this;
        }

        public CustomerBuilder employer(String employer) {
            this.employer = employer;
            return this;
        }

        public CustomerBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public CustomerBuilder maritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.firstName = this.firstName;
            customer.lastName = this.lastName;
            customer.personalNumber = this.personalNumber;
            customer.age = this.age;
            customer.middleName = this.middleName;
            customer.city = this.city;
            customer.countryCode = this.countryCode;
            customer.employer = this.employer;
            customer.maritalStatus = this.maritalStatus;
            customer.monthlyIncome = this.monthlyIncome;
            customer.gender = this.gender;
            return customer;
        }

    }

    private String id;

    //Mandatory
    private String firstName;
    private String lastName;
    private String personalNumber;

    //Optional
    private String middleName;
    private int age;
    private String countryCode;
    private String city;
    private BigDecimal monthlyIncome;
    private String employer;
    private String gender;
    private String maritalStatus;

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployer() {
        return employer;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setId(String id) {
        this.id = id;
    }
}
