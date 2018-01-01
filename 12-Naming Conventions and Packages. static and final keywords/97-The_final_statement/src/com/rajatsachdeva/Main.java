package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());
        SomeClass two = new SomeClass("two");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());
        SomeClass three = new SomeClass("three");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // Cannot assign value to final variable
        // one.instanceNumber = 5;
    }
}
