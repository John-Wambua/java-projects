package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount wambua = new BankAccount(1123,5000, "John","jwambua307@gmail.com","254700123456");
        System.out.println("Balance "+wambua.getBalance());
        wambua.withdraw(2500);
        System.out.println("Balance "+wambua.getBalance());
        wambua.deposit(700);

        VipCustomer vipCustomer1 = new VipCustomer("John",99.9);
        System.out.println("Credit Limit "+vipCustomer1.getCreditLimit());
        System.out.println("Email Address "+vipCustomer1.getEmailAddress());
    }
}
