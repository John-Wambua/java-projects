package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(30));

        int number =4;
        int finishNumber = 20;
        int count = 0;
        while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println(number+" is even");
            if (count==5){
                break;
            }


        }
        System.out.println("Found "+count+ " even numbers.");
    }
    public static boolean isEvenNumber(int number){
        if (number<0) return false;
        return number%2==0;
    }
}
