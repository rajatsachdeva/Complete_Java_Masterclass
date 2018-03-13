package com.rajatsachdeva;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            // Catching multiple exceptions with single catch block
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, shutting down");
        }

    }

    private static int divide() {
        int x, y;
//        try {
        x = getInt();
        y = getInt();

        System.out.println("x is " + x + ", y is " + y);

        return x / y;

//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No Suitable Input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by Zero");
//        }
    }

    private static int getInt() {
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
