package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] ints =sortIntegers(getIntegers(5));
        printIntegers(ints);
    }

    public static int[] getIntegers(int number){
        int [] integers = new int[number];
        System.out.println("Enter "+number+ " integers");
        for (int i=0; i<integers.length; i++){
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static void printIntegers(int [] integers){
        for (int i=0; i<integers.length; i++){
            System.out.println("Element at position "+i+" is "+integers[i]);
        }
    }
    public static int[] sortIntegers(int[] array){

        int [] newArray = new int[array.length];

        for (int i=0; i<array.length;i++){
            newArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i=0; i<newArray.length-1; i++){
                if (newArray[i]<newArray[i+1]){
                    temp = newArray[i+1];
                    newArray[i+1]=newArray[i];
                    newArray[i]=temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
