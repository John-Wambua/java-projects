package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myArr = new int[10];

        int [] myArr2 = {1,2,3,4,5,6};

        int [] myArr3 = new int[10];
        for (int i=0; i<myArr3.length; i++){
            myArr3[i] = i*2;
        }
        for (int i =0; i<myArr3.length; i++){
            System.out.println("Element "+i+" is "+myArr3[i]);
        }
        myArr[2] = 10;
        System.out.println(myArr2[5]);


        int [] myIntegers = getIntegers(10);
        System.out.println("Average: "+getAverage(myIntegers));

//        System.out.println("************************");
//
//        for (int i=0; i<myIntegers.length; i++){
//            System.out.println("Integer at position "+i+" is "+myIntegers[i]);
//        }

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values");
       int [] values = new int[number];

       for (int i=0; i<values.length; i++){
           values[i] = scanner.nextInt();
       }
       return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;

        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum/(array.length);
    }
}
