package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("MIN = "+myMinIntValue);
        System.out.println("MAX = "+myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("BYTE MIN = "+myMinByteValue);
        System.out.println("BYTE MAX = "+myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("SHORT MIN = "+myMinShortValue);
        System.out.println("SHORT MAX = "+myMaxShortValue);

        long myLongValue = 100L;

        byte myByteVar = 50;
        short myShortVar = 100;
        int myIntVar =210;
        long total = 50000L + (myByteVar + myShortVar +
                myIntVar)*10L;
        System.out.println(total);

    }
}
