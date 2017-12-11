package com.rajatsachdeva;

// Inner Classes
// Class inside a class

/* Four types of Nested classes
 * Static nested class - To associate a class with it's outer class
 * non-Static nested
 * local class, inner class that's define inside of a scope of usually a method
 * anonymous class which is a nested class without a class name
 */

public class Main {

    public static void main(String[] args) {
        // Instances will be created using outer class only
        Gearbox mcLaren = new Gearbox(6);
        // Correct way
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
        Gearbox.Gear third = mcLaren.new Gear(3, 17.4);

        // Cannot do following
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.4);


        System.out.println(first.driveSpeed(1000));

    }
}