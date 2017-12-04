package com.rajatsachdeva;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initalTransactionAmount) {
        // validate if customer already exists in branch
        if(findCustomer(customerName) != null) {
            System.out.println("Customer " + customerName + " already exists. Cannot be added.");
            return false;
        }
        customers.add(new Customer(customerName, initalTransactionAmount));
        System.out.println("Customer " + customerName + " added successfully in branch " + branchName);
        return true;
    }

    public void addNewTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if( null == customer) {
            System.out.println("Customer " + customerName + " not found in records. Cannot add additional transaction" +
                    ".");
            return;
        }

        customer.addTransaction(transaction);
        System.out.println("Transaction of amount " + transaction + " added for customer " + customerName + " at " +
                "Branch " + branchName) ;
    }

    private Customer findCustomer(String CustomerName) {
        int pos = findCustomerPosition(CustomerName);
        if(findCustomerPosition(CustomerName) >= 0) {
            return customers.get(pos);
        }
        return null;
    }

    private int findCustomerPosition(String CustomerName) {
        Customer customer = null;
        for(int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            if(customer.getCustomerName().equals(customer)) {
                return i;
            }
        }
        return -1;
    }

    public void displayCustomers(boolean displayTransactions) {
        System.out.println("There are total " + customers.size() + " customer for Branch " + branchName) ;
        System.out.println("Customers: ");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(String.format("%d -> %s", (i + 1), customer.getCustomerName()));
            if(displayTransactions) {
                customer.displayTransactions();
            }
        }
    }
}
