package com.example.employeeapi.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String dob;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String zipcode;
    private String country;
    private String ssn;
    private String gender;

    // Constructors
    public Employee() {
    }

    public Employee(String firstName, String lastName, String dob, String addressLine1, String addressLine2,
            String state, String zipcode, String country, String ssn, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.ssn = ssn;
        this.gender = gender;
    }

    // Getters and Setters
    // ... (generate using IDE)
}
