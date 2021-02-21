package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (true){
           int order = counter + 1;
           System.out.println("Enter number #"+order);
           if (scanner.hasNextInt()){
               int number = scanner.nextInt();
               sum+=number;
               counter++;
               if (counter==10){
                   break;
               }
           }else {
               System.out.println("Invalid number");
           }
           scanner.nextLine();

       }
        System.out.println("Sum is "+sum);
        scanner.close();
    }
}
