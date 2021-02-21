package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(100));
    }
    public static int sumDigits(int number){
        if (number<=9){
            return -1;
        }
        int countDigits = 0;
        while (number>0){
            int lastDigit = number%10;
            countDigits+=lastDigit;
            number = number/10;
        }
        return countDigits;
    }
}
