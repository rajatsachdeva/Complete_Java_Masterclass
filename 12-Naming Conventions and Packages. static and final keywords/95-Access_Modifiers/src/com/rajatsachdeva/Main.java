package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Account rajatsAccount = new Account("Rajat");
        rajatsAccount.deposit(1000);
        rajatsAccount.withdraw(500);
//        rajatsAccount.withdraw(500);
//        rajatsAccount.withdraw(500);
        rajatsAccount.withdraw(-200);
        rajatsAccount.withdraw(-20);
        rajatsAccount.calculateBalance();

        System.out.println("Balance on Rajat's Account is " + rajatsAccount.getBalance());
    }
}
