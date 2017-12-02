package com.rajatsachdeva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        /*System.out.println("Enter 10 Integers: ");
        getInput();
        printArray(baseData);
        resizeArray();

        // original values plus 2 extra values will be present
        baseData[10] = 98;
        baseData[11] = 99;
        printArray(baseData);

        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);

        */

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Exiting. . .");
                    break;
                default:
                    System.out.println("wrong choice. Enter 0-6.");
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("\nEnter the item name: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("\nEnter old item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("\nEnter new item name: ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, item);
    }

    public static void removeItem() {
        System.out.print("\nEnter item to be removed: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("\nEnter search item: ");
        String searchItem = scanner.nextLine();
        int position = groceryList.findItem(searchItem);

        if (position >= 0) {
            System.out.println(searchItem + " is present in the list.");
        } else {
            System.out.println(searchItem + " is not present in the list.");
        }
    }

    public static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Resize array
    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
