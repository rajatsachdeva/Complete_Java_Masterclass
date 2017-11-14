package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {

        //  assign unicode value to char
        //  https://unicode-table.com/en/
        //  this value is copyright symbol
	    char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        // width of char is 2 bytes (16 Bytes)

        boolean myBoolean = false;
        System.out.println("myBoolean output is: " + myBoolean);

        boolean isMale = true;
        System.out.println("isMale output is: " + isMale);

        //Challenge
        /* 1. Find the code for the registered symbol on the same line as
         * copyright symbol
         * 2. Create a variable of type char and assign it the unicode value
         * for that symbol
         * 3. Display it on screen
         */

        char mySym = '\u00AE';
        System.out.println("Registered Symbol: " + mySym);
    }
}
