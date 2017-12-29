package com.example.test;

import com.rajatsachdeva.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
	    /**
         * Test Code
         */

        System.out.println("********nSum*******");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("********factorial*******");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("********fibonacci*******");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
