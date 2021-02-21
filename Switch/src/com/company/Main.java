package com.company;

public class Main {

    public static void main(String[] args) {

        char value='B';
        switch (value){
            case 'A':
                System.out.println("Your value is A!");
                break;
            case 'B':
                System.out.println("Your value is B!");
                break;
            case 'C':
                System.out.println("Your value is C!");
                break;
            case 'D':
                System.out.println("Your value is D!");
                break;
            case 'E':
                System.out.println("Your value is E!");
                break;
            default:
                System.out.println("Letter not found!");
                break;
        }
        
    }
}
