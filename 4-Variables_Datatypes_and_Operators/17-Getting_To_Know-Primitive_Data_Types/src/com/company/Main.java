/*
 *   Data Types dealing with whole numbers
 */

package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        /*  Size of Integer = 4bytes (32 bits)
                                    Min             Max
            Range for integer is - (2^32)/2 to ((2^32)/2) - 1
         */

        /* Assigning the minimum integer value
            -2147483649 will give an error
         */
        //Type  Name         Literal
        int     myMinValue  = -2147483648;

        /* Assigning the maximum integer value
            2147483648 will give an error
         */
        // We can make a number more readable by adding '_' [Added from Java 7]
        int myMaxValue      = 2_147_483_647;

        /* Size/width of Byte = 1 byte , 8 bits , -128 to 127" */
        byte myByteValue    = -128;
        //byte myNewByteValue = (myByteValue/2); Gives an error as 2 is not Byte it's Integer
        //Type casting
        byte myNewByteValue = (byte) (myByteValue/2);

        /* Size/width of short = 2 bytes, 16 bits
        * -32768 to 32767
        */
        short myShortValue  = 32767;
        short myNewShortValue = (short)(myShortValue/2);

        /* We can use l/L , it's better to use L for better readability
         * Long has a width of 64 bits (8 byte)
         */
        long myLongValue    = 100L;

        System.out.println("myMinValue: "   + myMinValue);
        System.out.println("myMaxValue: "   + myMaxValue);
        System.out.println("myByteValue: "  + myByteValue);
        System.out.println("myShortValue: " + myShortValue);
        System.out.println("myLongValue: "  + myLongValue);

        int myTotal         = (myMinValue/2);
        System.out.println("myTotal: "       + myTotal);
        System.out.println("myNewByteValue: " +  myNewByteValue);
        System.out.println("myNewShortValue: " + myNewShortValue);

        // Create a Byte variable
        byte myByte = 10;

        // Create a short variable
        short myShort = 20000;

        // Create an int variable
        int myInt = 4000000;

        // Create a long variable
        long myLong = (long) (50000 + (10 * (myByte + myShort + myInt)));
        System.out.println("myLong: " + myLong);
    }
}
