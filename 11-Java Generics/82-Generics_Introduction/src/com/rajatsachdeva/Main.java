package com.rajatsachdeva;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList items = new ArrayList();

        // Autoboxing
        items.add(1);
        items.add(2);
        items.add(3);
        // Adding some invalid value
        // Following will compile fine, But this will give runtime error
        // items.add("Rajat");
        items.add(4);
        items.add(5);

        printDoubled(items);
        System.out.println("\n**************GENERICS*************\n");

        // Using generics/ parametrized type
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        // Following gives compile time error
        // So it is caught before hand
        // integerArrayList.add("Rajat");
        integerArrayList.add(4);
        integerArrayList.add(5);
        printDoubledGeneric(integerArrayList);
    }

    /**
     * Will double each entry of input ArrayList
     *
     * @param n Input ArrayList
     */
    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }

    /**
     * Will double each entry of input ArrayList
     *
     * @param n Input ArrayList
     */
    private static void printDoubledGeneric(ArrayList<Integer> n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
