package com.rajatsachdeva;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
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
        System.out.println("Deposit: A/C "+accountNumber + ": Balance = " + balance);
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
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account Constructor with parameters called");
    }

    public void withdraw(double amount){
        // Check if balance available
        if (balance <= amount) {
            System.out.println("Withdraw: A/C " + accountNumber + ": Insufficient Funds !");
            System.out.println("Available Balance = " + balance);
            return;
        }

        balance -= amount;
        System.out.println(amount + " withdrew from " + accountNumber);
        System.out.println("Withdraw: "+accountNumber + ": Balance = " + balance);
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
