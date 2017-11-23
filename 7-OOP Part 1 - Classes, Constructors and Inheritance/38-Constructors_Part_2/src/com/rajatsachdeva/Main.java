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
        rajatsAccount.withdraw(50);
        rajatsAccount.deposit(501);
        rajatsAccount.withdraw(100);

        Account bobsAccount = new Account("987654321", 100.0,
                "Bob Marley", "bob@marley.com", "9999-999-999");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        Account timsAccount = new Account("Tim", "tim@abc.com", "12244323");
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getAccountNumber());
        System.out.println(timsAccount.getBalance());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        System.out.println("\n\n************************\n\n");

        VipCustomer firstVipPerson = new VipCustomer();
        System.out.println("name: " + firstVipPerson.getName() + "\ncredit Limit: "
                + firstVipPerson.getCreditLimit() + "\nemail: " + firstVipPerson.getEmail());
        System.out.println("firstVipPerson created successfully\n");

        VipCustomer secondVipPerson = new VipCustomer("SecondPerson", 900000, "xyz@abc.com");
        System.out.println("name: " + secondVipPerson.getName() + "\ncredit Limit: "
                + secondVipPerson.getCreditLimit() + "\nemail: " + secondVipPerson.getEmail());
        System.out.println("secondVipPerson created successfully\n");

        VipCustomer thirdVipPerson = new VipCustomer("ThirdPerson", 80000);
        System.out.println("name: " + thirdVipPerson.getName() + "\ncredit Limit: "
                + thirdVipPerson.getCreditLimit() + "\nemail: " + thirdVipPerson.getEmail());
        System.out.println("thirdVipPerson created\n");

    }
}
