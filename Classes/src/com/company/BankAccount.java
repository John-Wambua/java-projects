package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(1234, 0.00,"default name","default email","default phone");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Deposit of ksh "+amount+ "/= made. New balance is ksh"+this.balance);
    }
    public void withdraw(double amount){
        if (this.balance<amount){
            System.out.println( "Only "+balance+ " available.");
        }else {
            this.balance-=amount;
            System.out.println("Withdraw of ksh "+amount+ "/= made. New balance is ksh"+this.balance);
        }
    }
}
