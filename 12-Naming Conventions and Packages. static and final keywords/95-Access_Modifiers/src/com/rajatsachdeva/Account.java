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
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. New Balance = " + this.balance);
        } else {
            System.out.println("Cannot deposit negative or zero amount");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0 && (-withdrawal <= this.balance)) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. New Balance = " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative or zero amount");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(int i: this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated Balance is " + this.balance);
    }
}
