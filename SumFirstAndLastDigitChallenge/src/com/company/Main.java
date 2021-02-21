package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int lastDigit = number%10;
        int firstDigit = 0;
        while (number>0){
            if (number<10 &&number >0){
                firstDigit = number;
            }
            number/=10;
        }
        System.out.println(firstDigit+"+"+lastDigit);
        return lastDigit + firstDigit;
    }
}
