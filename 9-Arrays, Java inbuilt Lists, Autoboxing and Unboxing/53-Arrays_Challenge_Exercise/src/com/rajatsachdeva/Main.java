package com.rajatsachdeva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        System.out.println("Enter size of integer array: ");
        int size = scanner.nextInt();

        int []array = getIntegers(size);
        printArray(array);
        array = sortIntegers(array);
        printArray(array);
    }

    // method to print array
    public static void printArray(int[] array) {
        System.out.println("Printing array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + i + " is " + array[i]);
        }
    }

    //method to get array from user
    public static int[] getIntegers(int size) {
        int[] array = new int[size];

        System.out.println("Enter " + size + " array elements:\r");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int [] array) {
        System.out.println("Sorting array");
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
