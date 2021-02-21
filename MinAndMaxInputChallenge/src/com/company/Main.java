package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber=0;
        int maxNumber =0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (first){
                    first=false;
                    minNumber =number;
                    maxNumber = number;
                }
                if (number>maxNumber){
                    maxNumber=number;
                }
                if (number<minNumber){
                    minNumber=number;
                }
            } else {
                break;
            }
        }
        scanner.nextLine();
        scanner.close();
        System.out.println("The maximum number is "+maxNumber);
        System.out.println("The minimum number is "+minNumber);

    }
}
