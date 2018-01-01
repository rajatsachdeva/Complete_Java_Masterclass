package com.rajatsachdeva;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    // we are able to override the method and we can actually change the functionality and this makes relevant
    // important information vulnerable
    // But this can avoided by making the method final in super/parent class
    /*@Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }*/
}

