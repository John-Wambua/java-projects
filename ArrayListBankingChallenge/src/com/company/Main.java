package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Supreme");
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    bank.printBranches();
                    break;
                case 2:
                    printCustomersInBranch();
                    break;
                case 3:
                    printCustomerTransactions();
                    break;
                case 4:
                    addBranch();
                    break;
                case 5:
                    addCustomerToBranch();
                    break;
                case 6:
                    addCustomerTransaction();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of Branches.");
        System.out.println("\t 2 - To print list of customers in branch.");
        System.out.println("\t 3 - To print customer transactions");
        System.out.println("\t 4 - To Add a new branch");
        System.out.println("\t 5 - To add a customer to branch with initial transaction");
        System.out.println("\t 6 - To add a transaction for a customer");
        System.out.println("\t 7 - Quit application");
    }

    private static void printCustomersInBranch() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        Branch branch = new Branch(branchName);
        branch.printCustomers();
    }

    private static void printCustomerTransactions() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        Branch branch = new Branch(branchName);
        branch.printCustomerTransactions(customerName);
    }
    private static void addCustomerToBranch() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter name of customer to be created: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter initial transaction amount of the customer: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();
        Customer customer =new Customer(customerName,transactionAmount);
        bank.addCustomerToBranch(branchName,customer);
    }

    public static void addCustomerTransaction(){
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();
        bank.addTransactionForCustomerInBranch(branchName,customerName,transactionAmount);
    }

    private static void addBranch() {
        System.out.println("Enter name of the branch: ");
        String branchName = scanner.nextLine();
        Branch branch = new Branch(branchName);
        bank.addNewBranch(branch);
    }




}
