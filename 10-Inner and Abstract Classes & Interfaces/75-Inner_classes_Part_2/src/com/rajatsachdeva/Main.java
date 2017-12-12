package com.rajatsachdeva;

// Inner Classes
// Class inside a class

/* Four types of Nested classes
 * Static nested class - To associate a class with it's outer class
 * non-Static nested
 * local class, inner class that's define inside of a scope of usually a method
 * anonymous class which is a nested class without a class name
 */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
        // Instances will be created using outer class only
//        Gearbox mcLaren = new Gearbox(6);
//
////        // Correct way
////        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
////        Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
////        Gearbox.Gear third = mcLaren.new Gear(3, 17.4);
////
////        // Cannot do following
//////        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//////        Gearbox.Gear third = new mcLaren.Gear(3, 17.4);
////
////
////        System.out.println(first.driveSpeed(1000));
//
//        // Not required now as gears are being add via constructor only
////        mcLaren.addGear(1, 5.3);
////        mcLaren.addGear(2, 10.6);
////        mcLaren.addGear(3, 15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


        // Local Class
        /*class ClickListner implements Button.OnClickListener {
            public ClickListner() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
*/

        // Anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

  //      btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}