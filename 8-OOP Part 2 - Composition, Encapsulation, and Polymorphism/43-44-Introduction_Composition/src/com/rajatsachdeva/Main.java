package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell",
                "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        // PC has a Case, has a Monitor, has a motherboard [composition]
        PC thePc = new PC(theCase, theMonitor, theMotherboard);

        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
        thePc.getMotherboard().loadProgram("Windows 1.0s");
        thePc.getTheCase().pressPowerButton();
    }
}
