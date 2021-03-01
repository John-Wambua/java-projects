package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String customerName, double initialTransactionAmount) {
        this.customerName = customerName;
        this.transactions.add(0,initialTransactionAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
    public String getCustomerName() {
        return customerName;
    }
}
