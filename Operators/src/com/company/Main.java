package com.company;

public class Main {

    public static void main(String[] args) {

        double x = 20.00d;
        double y = 80.00d;

        double res1 = (x + y) * 100.00d;
        double remainder = res1 % 40.00d;

        System.out.println(remainder);
        boolean isRemainderZero = remainder ==0? true: false;

        System.out.println(isRemainderZero);

        if (!isRemainderZero){
            System.out.println("Got Some Remainder");
        }
    }
}
