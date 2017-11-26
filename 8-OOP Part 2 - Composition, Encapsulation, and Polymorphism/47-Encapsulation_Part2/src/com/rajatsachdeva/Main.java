package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {

        // Create a class and demonstrate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.
        Printer printer = new Printer(90,false);
        System.out.println("Current Toner Level: " + printer.getTonerLevel());
        System.out.println("Number of pages printed : " + printer.printPages(91));
        System.out.println("Current Toner Level: " + printer.getTonerLevel());
        printer.fillUpPrinter();
        System.out.println("Current Toner Level: " + printer.getTonerLevel());
        System.out.println("Number of pages printed : " + printer.printPages(91));
        System.out.println("Current Toner Level: " + printer.getTonerLevel());

        System.out.println("\nCreated new Printer");
        Printer printer1 = new Printer(50, true);
        System.out.println("Current Toner Level: " + printer1.getTonerLevel());
        System.out.println("Initial page count = " + printer1.getNumberOfPagesPrinted());
        System.out.println("Number of pages printed : " + printer1.printPages(4));
        System.out.println("Current Toner Level: " + printer1.getTonerLevel());
        printer1.addToner(60);
        System.out.println("Number of pages printed : " + printer1.printPages(10));
        System.out.println("Total page print count : " + printer1.getNumberOfPagesPrinted());
        System.out.println("Current Toner Level: " + printer1.getTonerLevel());
    }
}
