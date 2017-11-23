package com.rajatsachdeva;

public class Account {

    //Fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to " + accountNumber);
        System.out.println("Deposit: A/C " + accountNumber + ": Balance = " + balance);
    }

    public Account() {
        // Assigning default values
        // Calling another constructor from other constructor
        // This must be first line always in constructor
        // Constructor overloading
        this("124567890", 1.00, "Default", "unkown@unknow.com", "000000000");
        System.out.println("Empty Constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        // It's better to directly assign the member variables values as compared
        // to using the setters inside constructors as there may be a case
        // where setters are not even called.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account Constructor with parameters called");
    }

    public Account(String customerName, String email, String phoneNumber) {
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
        this("999", 100.00, customerName, email, phoneNumber);
        System.out.println("Constructor called with 3 parameters");
    }

    public void withdraw(double amount) {
        // Check if balance available
        if (balance < amount) {
            System.out.println("Withdraw: A/C " + accountNumber + ": Insufficient Funds !");
            System.out.println("Available Balance = " + balance);
            return;
        }

        balance -= amount;
        System.out.println(amount + " withdrew from " + accountNumber);
        System.out.println("Withdraw: " + accountNumber + ": Balance = " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
