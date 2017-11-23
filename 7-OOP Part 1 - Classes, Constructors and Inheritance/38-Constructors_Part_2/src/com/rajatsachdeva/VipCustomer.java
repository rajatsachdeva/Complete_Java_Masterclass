package com.rajatsachdeva;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("DefaultName", 50000.00, "Defaultemail");
        System.out.println("Default Constructor Called");
    }

    public VipCustomer(String name, double creditLimit) {
//        this.name = name;
//        this.creditLimit = creditLimit;
        this(name, creditLimit, "Defaultemail");
        System.out.println("Constructor with 1 default parameter called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Parametrised Constructor Called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
