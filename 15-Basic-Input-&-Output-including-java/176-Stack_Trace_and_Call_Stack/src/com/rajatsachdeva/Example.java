package com.rajatsachdeva;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        // Following code generates ArithmeticException in case of divide by zero
//        int x = getInt();
//        int y = getInt();
//        System.out.println("x is " + x + ", y is " + y);
//        return x / y;

        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch (NoSuchElementException e) {
            // we can't retry input here in-case of EOF as input stream will be closed as result of EOF
            // (Ctrl/Command + D), so we will end-up generating a new exception NoSuchElementException under
            // catch block only
//            x = getInt();
//            y = getInt();
            throw new ArithmeticException("No Suitable Input");
        }

        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempt to divide by Zero");
        }
    }

    private static int getInt() {
        // Following commented code generates InputMismatchException in case user enters any input other than integer
//        Scanner s = new Scanner(System.in);
//        System.out.print("Please enter an integer ");
//        return s.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer ");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // Repeat again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only digits 0 to 9 ");
            }
        }
    }
}
