package com.rajatsachdeva;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        branches = new ArrayList<Branch>();
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialTransactioAmount) {
        // validate branch
        Branch branch = findBranch(branchName);

        if(null == branch) {
            System.out.println("Branch " + branchName + " is not a valid branch. Cannot add new customer: " + customerName);
            return false;
        }

        return branch.addNewCustomer(customerName, initialTransactioAmount);
    }

    public boolean addNewTransaction(String branchName, String customerName, double transaction) {
        // validate branch
        Branch branch = findBranch(branchName);

        if(null == branch) {
            System.out.println("Branch " + branchName + " is not a valid branch. Cannot add new  transaction for " +
                    "customer: " + customerName);
            return false;
        }

        // add the transaction
        branch.addNewTransaction(customerName, transaction);
        return true;
    }

    public boolean addNewBranch(String branchName) {
        // validate if branch already exists
        if(null != findBranch(branchName)) {
            System.out.println("Branch " + branchName + " already exists for " + bankName);
            return false;
        }

        branches.add(new Branch(branchName));
        System.out.println("Branch " + branchName + " added successfully for Bank " + bankName);
        return true;
    }

    // check if branch exists
    private Branch findBranch(String branchName) {
        Branch checkedBranch = null;

        for(int i = 0; i < branches.size(); i++) {
            checkedBranch = branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    private int findBranchPosition(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean displayCustomers(String branchName, boolean displayTransactions) {
        Branch branch = findBranch(branchName);
        if(null != branch) {
            branch.displayCustomers(displayTransactions);
            System.out.println();
            return true;
        }
        return false;
    }
}
