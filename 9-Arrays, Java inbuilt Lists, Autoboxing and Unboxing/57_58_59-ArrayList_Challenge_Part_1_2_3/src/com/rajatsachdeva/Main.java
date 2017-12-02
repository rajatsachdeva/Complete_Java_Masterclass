package com.rajatsachdeva;

import javax.crypto.Cipher;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone;

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        System.out.print("Enter your phone number: ");
        mobilePhone = new MobilePhone(scanner.nextLine());
        System.out.println("Staring Mobile phone . . .");

        int choice = 0;
        boolean quit = false;
        printMenu();

        while(!quit) {
            System.out.print("\nEnter the choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // to handle the enter key

            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    System.out.println("Quiting");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Choice. Please choose 0-6.");
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("\nPress:");
        System.out.println("\t0 - Display Menu");
        System.out.println("\t1 - Display Contacts");
        System.out.println("\t2 - Add contact");
        System.out.println("\t3 - Update contact");
        System.out.println("\t4 - Remove contact");
        System.out.println("\t5 - Search contact");
        System.out.println("\t6 - Quit");
    }


    public static void addContact() {

        System.out.print("Enter Contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact's number: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name , number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added successfully");
        } else {
            System.out.println("Contact already exists. Cannot be added.");
        }
    }

    public static void updateContact() {
        System.out.print("Enter old contact name: ");
        String oldContact = scanner.nextLine();

        System.out.print("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = new Contact(newContactName, newNumber);

        if(mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Contact Updated Successfully");
        }

    }

    public static void removeContact() {
        System.out.print("Enter the Contact Name: ");
        if(mobilePhone.removeContact(scanner.nextLine())){
            System.out.println("Contact Deleted Successfully");
        }
    }

    public static void searchContact() {
        System.out.println("Enter the Contact Name: ");
        String contact = scanner.nextLine();

        if (mobilePhone.searchContact(contact) != null) {
            System.out.println(contact + " present in the File.");
        } else {
            System.out.println(contact + " not present in the File.");
        }
    }
}
