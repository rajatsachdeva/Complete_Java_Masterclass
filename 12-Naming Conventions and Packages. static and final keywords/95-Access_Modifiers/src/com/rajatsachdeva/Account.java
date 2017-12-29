package com.rajatsachdeva;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
        System.out.println("Account created for " + this.accountName);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. New Balance = " + this.balance);
        } else {
            System.out.println("Cannot deposit negative or zero amount");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. New Balance = " + this.balance);
        } else {
            System.out.println("Cannot deposit negative or zero amount");
        }
    }
}
