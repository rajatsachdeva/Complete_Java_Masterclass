package com.rajatsachdeva;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact " + contact.getName() + " is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printContacts() {
        System.out.println("There are " + myContacts.size() + " contacts in file.\nContact List");
        Contact contact;
        for (int i = 0; i < myContacts.size(); i++) {
            contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + "\t->\t\t" + contact.getPhoneNumber());
        }
    }

    public boolean updateContact(String oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0) {
            System.out.println(oldContact + " was not found.");
            return false;
        }

        myContacts.set(position, newContact);
        System.out.println(oldContact + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(String.format("Contact %s not present in the File. Cannot be removed.",
                    contact.getName()));
            return false;
        }
        myContacts.remove(position);
        System.out.println(String.format("Contact %s at position %d was removed from File.", contact.getName(),
                position + 1));
        return true;
    }


    public boolean removeContact(String contactName) {
        int position = findContact(contactName);
        if(position < 0) {
            System.out.println(String.format("Contact %s not present in the File. Cannot be removed.", contactName));
            return false;
        }
        myContacts.remove(position);
        System.out.println(String.format("Contact %s at position %d was removed from File.", contactName, position +
                1));
        return true;
    }

    public Contact searchContact(String contactName) {
        int position  = findContact(contactName);
        if(position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0;i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int foundPosition = findContact(name);
        if (foundPosition >= 0) {
            return myContacts.get(foundPosition);
        }
        return null;
    }
}
