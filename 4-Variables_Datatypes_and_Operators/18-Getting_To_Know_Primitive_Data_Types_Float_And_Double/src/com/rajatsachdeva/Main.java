/*
    Dealing with Floating Point Numbers
    float:  Single Precision FP Numbers
    double: Double Precision FP Numbers
 */

package com.rajatsachdeva;

import com.sun.tools.javac.util.Convert;

public class Main {

    public static void main(String[] args) {
        /* Declarations */

        // Width of integer = 4 bytes
        int     myIntValue      = 5;
        // Width of float  = 4 bytes
        float   myFloatValue    = 5f;
        //myFloatValue            = (float) 5.25;
        // Width of double  = 8 bytes
        /*
         * It's recommended to use Double in all mathematical
         * calculations as: 1) it's fast and used in most machines
         * 2) Used in most predefined java methods
         */
        double  myDoubleValue   = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        myIntValue              = 5 / 2;
        myFloatValue            = 5f / 2;
        myDoubleValue           = 5d / 2;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        myIntValue              = 5 / 3;
        myFloatValue            = 5f / 3f;
        myDoubleValue           = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        /* Challenge */
        /* Convert a given number of pounds to Kilograms
        *  1. Create a variable to store the number of pounds
        *  2. Calculate the number of kg from above number of pounds and store in a variable
        *  3. Print the result
        *
        *  Note: 1 pound is equal to 0.45359237 kilograms
        */

        double myPounds = 200d;
        double mykg     = myPounds * 0.45359237d;   // 90.7185
        System.out.println("Pounds = " + myPounds + "\nkilograms = " + mykg );

        // pi value
        double pi = 3.141_592_7d;
    }
}
