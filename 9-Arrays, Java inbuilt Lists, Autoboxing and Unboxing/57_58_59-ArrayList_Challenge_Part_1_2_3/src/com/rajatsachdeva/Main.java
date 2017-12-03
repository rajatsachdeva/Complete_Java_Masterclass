package com.rajatsachdeva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
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

        int choice = 0;
        boolean quit = false;
        startPhone();
        printMenu();

        while(!quit) {
            System.out.print("\nEnter the choice: (0 to display actions)");
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

    public static void startPhone() {
        System.out.println("Staring Mobile phone . . .");
    }

    public static void printMenu(){
        System.out.println("\nAvailable actions:\nPress:");
        System.out.println("\t0 - Display Menu");
        System.out.println("\t1 - Display Contacts");
        System.out.println("\t2 - Add contact");
        System.out.println("\t3 - Update contact");
        System.out.println("\t4 - Remove contact");
        System.out.println("\t5 - Search contact");
        System.out.println("\t6 - Quit");
        System.out.println("Choose you action:");
    }


    public static void addContact() {

        System.out.print("Enter Contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact's number: ");
        String number = scanner.nextLine();
        // Using the static method/ Factory method directly from class name
        Contact newContact = Contact.createContact(name, number);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added successfully: " + name + ", phone = " + number);
        } else {
            System.out.println("Contact already exists. Cannot be added.");
        }
    }

    public static void updateContact() {
        System.out.print("Enter old contact name: ");
        String oldContactName = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(oldContactName);
        if (null == oldContact) {
            System.out.println("Contact not present in the File. Cannot be udpated");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newContactName, newNumber);

        if(mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Contact Updated Successfully");
        } else {
            System.out.println("Error while updating contact record");
        }
    }

    public static void removeContact() {
        System.out.print("Enter the Contact Name: ");
        String oldContactName = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(oldContactName);
        if (null == oldContact) {
            System.out.println("Contact not present in the File. Cannot be Removed");
            return;
        }

        if (mobilePhone.removeContact(oldContactName)) {
            System.out.println(String.format("Contact %s deleted successfully from File.", oldContactName));
        } else {
            System.out.println("Error while removing the record from File.");
        }
    }

    public static void searchContact() {
        System.out.println("Enter the Contact Name: ");
        String contactName = scanner.nextLine();

        Contact contact = mobilePhone.queryContact(contactName);
        if (null == contact) {
            System.out.println(String.format("Contact %s not present in the File.", contactName));
        } else {
            System.out.println(String.format("Contact %s present in the File. Here are the details:", contactName));
            System.out.println(contact.getName() + "\t->\t" + contact.getPhoneNumber());
        }
    }
}
