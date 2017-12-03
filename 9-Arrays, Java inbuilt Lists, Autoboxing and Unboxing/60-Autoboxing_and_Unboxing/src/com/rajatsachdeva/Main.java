package com.rajatsachdeva;

import java.util.ArrayList;

// Created a wrapper class
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

}

public class Main {

    public static void main(String[] args) {

        // Arrays
        String [] strArray = new String[10];
        int[] intArray = new int[10];

        // ArrayList
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Rajat");

        // Cannot do following We cannot have primitive type array list
        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(99));

        // Class Integer
        // Long way of declaration
        Integer integer = new Integer(54);

        Double doublevalue = new Double(12.1212);

        ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList1.add(Integer.valueOf(i));
            // autoboxing: converting a base primitive type int to an Integer class
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList1.get(i).intValue());
            // Unboxing: converting the Class object type to base primitive type int
        }
        System.out.println();

        // Short way
        Integer myIntValue = 56; // At compile time converted to Integer.valueOf(56); autoboxing
        int myInt = myIntValue; //myIntValue.intValue(); unboxing

        ArrayList<Double> myDoubleList = new ArrayList<Double>();

        //Insert in a Double array list
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleList.add(Double.valueOf(dbl)); //autoboxing
            myDoubleList.add(dbl);
        }

        for (int i = 0; i < myDoubleList.size(); i++) {
//            System.out.println(i + " --> " + myDoubleList.get(i).doubleValue()); //unboxing
            System.out.println(i + " --> " + myDoubleList.get(i));
        }


    }
}
