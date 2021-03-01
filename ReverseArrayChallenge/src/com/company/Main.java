package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        reverse(arr);
    }

    public static void reverse(int[] array){
//        for (int i= array.length-1;i>0; i++){
//            array[i] =
//        }
        System.out.println("Main Array "+ Arrays.toString(array));
        int lastEl = array.length-1;
        int halfLength = array.length/2;
        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[lastEl];
            array[lastEl] = temp;
            lastEl--;
        }

        System.out.println("Reserved Array "+ Arrays.toString(array));

    }
}
