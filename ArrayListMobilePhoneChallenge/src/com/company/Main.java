package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
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
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter contact Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone Number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.storeContact(new Contact(name, phoneNumber));
    }

    private static void modifyContact() {
        System.out.print("Enter current contact's name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact.getContactName() ==null){
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter updated contact's name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter updates contact's phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        if (mobilePhone.modifyContact(existingContact, new Contact(newName, newPhoneNumber))){
            System.out.println("Contact updated successfully");
        }else {
            System.out.println("Error updating contact");
        }
    }
    private static void searchForContact() {
        System.out.println("Enter contact's name: ");
        String name = scanner.nextLine();
        Contact contact =mobilePhone.queryContact(name);
        if (contact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Contact "+contact.getContactName()+" is saved in the contacts list.");

    }

    private static void removeContact() {
        System.out.println("Enter contact's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact's number");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        mobilePhone.removeContact(contact);
    }


    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update existing contact.");
        System.out.println("\t 4 - To remove contact.");
        System.out.println("\t 5 - To search/find contact.");
        System.out.println("\t 6 - To quit the application.");
    }

}
