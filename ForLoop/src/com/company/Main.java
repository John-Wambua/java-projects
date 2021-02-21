package com.company;

public class Main {

    public static void main(String[] args) {
//        calculateInterest(10000,40.0)
        for (int i = 8; i>=2; i--){
            System.out.println("10,000 at "+ i+ "% interest = "+String.format("%.2f",calculateInterest(10000,i)));
        }
        int count=0;
        for (int i=15; i<=35;i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a prime number.");
                if (count ==3){
                    System.out.println("Exiting for loop...");
                    break;
                }
            }
        }
    }

    public static  boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
       return (amount* (interestRate/100));
    }
}
