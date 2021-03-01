package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void printContacts(){
        System.out.println("You have "+contacts.size()+ " contacts.");
        for (int i=0; i<contacts.size(); i++){
            System.out.println(i+1+". Name: "+contacts.get(i).getContactName()+ "; Phone Number: "+contacts.get(i).getPhoneNumber());
        }
    }
    public void storeContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact "+contact.getContactName()+": "+contact.getPhoneNumber()+" saved successfully.");
    }


    public boolean modifyContact(Contact currentContact, Contact newContact){
        int position = findContact(currentContact);
        if (position>=0){
            contacts.set(position, newContact);
            return true;
        }
        return false;
    }

    public void removeContact(Contact contact){
        int position = findContact(contact);
        if (position>=0){
            contacts.remove(position);
            System.out.println(contact.getContactName()+ "was not found");
        }else {
            System.out.println(contact.getContactName()+" not found");
        }
    }


    public Contact queryContact(String contactName){
        int position = findContact(contactName);
        if (position>=0){
            return contacts.get(position);
        }else {
            return null;
        }
    }

    private int  findContact(String contactName){
        for (int i =0; i<contacts.size(); i++){
            Contact contact = contacts.get(i);
            if (contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contact contact){
        return contacts.indexOf(contact);
    }
}
