package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(Customer customer){
        int position = findCustomer(customer.getCustomerName());
        if (position>=0){
            System.out.println("Customer "+customer.getCustomerName()+" already exists.");
            return;
        }
        customers.add(customer);
        System.out.println("Customer added successfully");
    }

    public void printCustomers(){
        System.out.println(customers.size()+" total customers in "+branchName);
        for (int i=0; i<customers.size(); i++){
            System.out.println(i+1+". "+customers.get(i).getCustomerName());
        }
    }

    public void printCustomerTransactions(String customerName){
        Customer customer = retrieveCustomer(customerName);
        if (customer==null){
            System.out.println("Customer does not exist");
            return;
        }
        ArrayList<Double> transactions = customer.getTransactions();
        System.out.println(customerName+ "has "+transactions.size()+ " transactions.");
        for (int i=0; i<transactions.size(); i++){
            System.out.println(i+1+". Ksh."+transactions.get(i)+"/=");
        }
    }

    public void addTransaction(String customerName, double amount){
        Customer customer = retrieveCustomer(customerName);
        if (customer!=null){
            customer.addTransaction(amount);
        }else {
            System.out.println("Customer not found");
        }
    }

    private int findCustomer(String customerName){
        for (int i=0; i<customers.size(); i++){
            Customer customer = customers.get(i);
            if (customer.getCustomerName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }


    private int findCustomer(Customer customer){
        return customers.indexOf(customer);
    }

    private Customer retrieveCustomer(String customerName){
        for (int i=0; i<customers.size(); i++){
            Customer customer = customers.get(i);
            if (customer.getCustomerName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
}
