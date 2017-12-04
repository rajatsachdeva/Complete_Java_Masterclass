package com.rajatsachdeva;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String customerName;

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);

        System.out.println("Customer: " + customerName + " created with inital trasaction amount = "
                + initialTransaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
        System.out.println("Transaction for value " + transaction + " added for customer" + customerName);
    }

    public void displayTransactions() {
        System.out.println("There are total " + transactions.size() + " transactions for " + customerName) ;
        System.out.println("Transactions: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(String.format("%d -> %f", (i + 1), transactions.get(i)));
        }
    }
}
