package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        // 8 Primitive Data Types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // Taken as the 9th datatype
        // String [ Sequence of characters ]
        // String is class
        // But is treated as Ninth primitive type
        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString); // Concatenate

        String lastString = "10";
        int myInt = 50;
        // converts the int to string and concatenates
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47;
        // converts the double to string and concatenates
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);
    }
}
