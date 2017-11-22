package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
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

        Account rajatsAccount = new Account();

        rajatsAccount.setAccountNumber("123456789");
        rajatsAccount.setCustomerName("Rajat Sachdeva");
        rajatsAccount.setBalance(0.00);
        rajatsAccount.setEmail("myemail@abc.com");
        rajatsAccount.setPhoneNumber("0000-000-000");

        rajatsAccount.withdraw(100);
        rajatsAccount.deposit(50);
        rajatsAccount.withdraw(100);
        rajatsAccount.deposit(501);
        rajatsAccount.withdraw(100);

        Account bobsAccount = new Account("987654321", 100.0,
                "Bob Marley", "bob@marley.com", "9999-999-999");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
    }
}
