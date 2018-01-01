package com.rajatsachdeva;

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber /* = 1 */;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public static int getClassCounter() {
        return classCounter;
    }
}
