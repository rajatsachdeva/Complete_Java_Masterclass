package com.rajatsachdeva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * LBYL: Look Before You Leap
         *
         * EAFP: Easy to Ask for Forgiveness than Permission
         */

        int x = 98;
        int y = 0;

        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
        //System.out.println(divide(x, y));

        //int z = getInt();
        //System.out.println("z is " + z);

//        int z = getIntLBYL();
        int z = getIntEAFP();
        System.out.println("z is " + z);
    }

    private static int getInt() {
        System.out.print("Enter: ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    // Doesn't seem very efficient
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }

        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an Integer");

        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }

    /**
     * divide
     *
     * Will generate the Arithmetic Exception in case of divide by 0
     * and hence crash
     * @param x
     * @param y
     * @return x / y
     */
    private static int divide(int x, int y) {
        return x / y;
    }
}
