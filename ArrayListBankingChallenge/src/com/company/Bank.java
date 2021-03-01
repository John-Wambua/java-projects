package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void printBranches(){
        System.out.println(bankName+" has "+branches.size()+" branches.");
        for (int i=0; i<branches.size(); i++){
            System.out.println(i+1+". "+branches.get(i).getBranchName());
        }
    }

    public void addNewBranch(Branch branch){
        int position = findBranch(branch.getBranchName());
        if (position>=0){
            System.out.println("Branch "+branch.getBranchName()+" already exists!");
            return;
        }
        branches.add(branch);
    }

    public void addCustomerToBranch(String branchName, Customer customer){
        Branch branch = retrieveBranch(branchName);
        if (branch==null){
            System.out.println("Branch does not exist!");
            return;
        }
        branch.addCustomer(customer);
    }

    public void addTransactionForCustomerInBranch(String branchName, String customerName, double amount){
        Branch branch = retrieveBranch(branchName);
        if (branch==null){
            System.out.println("Branch does not exist!");
            return;
        }
       branch.addTransaction(customerName, amount);

    }

    private int findBranch(String branchName){
        for (int i=0; i<branches.size(); i++){
            Branch branch = branches.get(i);
            if (branch.getBranchName().equals(branchName)){
                return i;
            }
        }
        return -1;
    }
    private Branch retrieveBranch(String branchName){
        for (int i=0; i<branches.size(); i++){
            Branch branch = branches.get(i);
            if (branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
}
