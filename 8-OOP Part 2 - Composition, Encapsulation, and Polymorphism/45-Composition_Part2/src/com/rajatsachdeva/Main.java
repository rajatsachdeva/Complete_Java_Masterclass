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

//        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePc.getMotherboard().loadProgram("Windows 1.0s");
//        thePc.getTheCase().pressPowerButton();
        thePc.powerUp();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        // Create Walls
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        // Create Ceiling
        Ceiling ceiling = new Ceiling(12, 55);

        // Add a bed in room
        Bed bed = new Bed("KingSize", 2 , 2, 2, 2);

        // Add a Lamp
        Lamp lamp = new Lamp("Modern", false, 100);

        // Complete Bedroom
        Bedroom bedRoom = new Bedroom("Rajat's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        System.out.println();
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
