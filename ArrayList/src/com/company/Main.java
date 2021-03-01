package com.company;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To list grocery items.");
        System.out.println("\t 2 - To add item to grocery list.");
        System.out.println("\t 3 - To modify item in grocery list.");
        System.out.println("\t 4 - To remove item from grocery list.");
        System.out.println("\t 5 - To search item in grocery list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter current item name: ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter name of item to be removed: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found "+searchItem+ " in our grocery list.");
        }else {
            System.out.println(searchItem + " not in the grocery list.");
        }

    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
