package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 1;
        while (true){
          if (scanner.hasNextInt()){
              int number = scanner.nextInt();
              sum+=number;
              average = (long) Math.round(sum/count);
              count++;
          }else {
              break;
          }
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.nextLine();
        scanner.close();
    }
}
