/*
 *   Data Types dealing with whole numbers
 */

package com.company;

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
        byte myByteValue    = 10;

        /* Size/width of short = 2 bytes, 16 bits
        * -32768 to 32767
        */
        short myShortValue  = 30000;

        /* We can use l/L , it's better to use L for better readability
         * Long has a width of 64 bits (8 byte)
         */
        long myLongValue    = 100L;

        System.out.println(myMinValue);
        System.out.println(myMaxValue);
        System.out.println(myByteValue);
        System.out.println(myShortValue);
        System.out.println(myLongValue);
    }
}
