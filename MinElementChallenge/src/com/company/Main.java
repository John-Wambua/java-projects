package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] integers = readIntegers(10);
        System.out.println("Array :"+Arrays.toString(integers));
        System.out.println("Minimum Value :"+ findMin(integers));
    }

    public static int[] readIntegers(int count){
        int [] myArr = new int[count];
        System.out.println("Enter "+count+" integers");
        for (int i =0; i< myArr.length; i++){
            myArr[i] = scanner.nextInt();
        }
        return myArr;
    }

    public static int findMin(int[] array){
        int minimumValue = array[0];
        for (int i = 1; i<array.length; i++){
            if (array[i]<minimumValue){
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }
}
