package com.rajatsachdeva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare array
        // Cannot initialize as int[] myVariable = 50;

//      int[] myVariable;
//	    myVariable = new int[10];
//      0 to n -1 ,n is size of array

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] myIntArray = new int[10];
        // Following approach will be very tedious
        // myIntArray[0] = 45;
        // myIntArray[1] = 46;
        // myIntArray[2] = 47;
        // myIntArray[3] = 48;
        // myIntArray[4] = 49;
        // myIntArray[5] = 50;

        // Can't do something like this.
        // only allowed while declaration
        // myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);

        System.out.println("\nLength of array \'myIntArray\': " + myIntArray.length + "\n" );

        double[] myDoubleArray = new double[5];
        // Assign
        for (int i = 0; i < myDoubleArray.length; i++) {
            myDoubleArray[i] = i * 10.0;
        }
        // get
        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.println("Element myDoubleArray[" + i + "], value is " + myDoubleArray[i]);
        }

        // Following exception is seen when out of bounds access is done from an array
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("Average: " + getAverage(myIntegers));

    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+ i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " interger values.\r");
        int []values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum is: " + sum);
        return (double) sum / array.length;
    }
}
