package com.rajatsachdeva;

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "chicken & Ham", 14.76 , "white");
        super.addHamburgerAddition1("chips", 1.87);
        super.addHamburgerAddition2("drinks", 2.89);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe: No addition allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe: No addition allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe: No addition allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe: No addition allowed");
    }
}
