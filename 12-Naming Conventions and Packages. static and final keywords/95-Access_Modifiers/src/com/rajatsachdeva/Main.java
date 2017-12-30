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

        // As all the members have public scope , we can directly access them using object
        // This is not a good thing to do as it defeats the actual motive for the method/Class
        // following is a fraud and bank can detect that
        // balance is now private
        //rajatsAccount.balance = 5000;

        System.out.println("Balance on Rajat's Account is " + rajatsAccount.getBalance());
        // transactions is private now
        // rajatsAccount.transactions.add(4500);
        rajatsAccount.calculateBalance();
    }
}
