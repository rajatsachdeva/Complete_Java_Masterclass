package com.rajatsachdeva;

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi: Staring Engine. . .");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi: Accelerating . .");
    }

    @Override
    public void brake() {
        System.out.println("Audi: Braking. . .");
    }
}

