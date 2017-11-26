package com.rajatsachdeva;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car: Starting Engine. . .");
    }

    public void accelerate() {
        System.out.println("Car: Accelerating. . .");
    }

    public void brake() {
        System.out.println("Car: Braking. . .");
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda: Staring Engine. . .");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda: Accelerating . .");
    }

    @Override
    public void brake() {
        System.out.println("Honda: Braking. . .");
    }
}

class Volkswagen extends Car {
    public Volkswagen(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Volkswagen: Staring Engine. . .");
    }

    @Override
    public void accelerate() {
        System.out.println("Volkswagen: Accelerating . .");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen: Braking. . .");
    }
}

class Hyundai extends Car {
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai: Staring Engine. . .");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai: Accelerating . .");
    }

    @Override
    public void brake() {
        System.out.println("Hyundai: Braking. . .");
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Honda city = new Honda("City", 4);
        Hyundai verna = new Hyundai("Verna", 4 );
        Volkswagen vento = new Volkswagen("Vento", 4);

        System.out.println(String.format("Car name: %s, cylinders: %d\n",
                city.getName(), city.getCylinders()));
        System.out.println(String.format("Car name: %s, cylinders: %d\n",
                verna.getName(), verna.getCylinders()));
        System.out.println(String.format("Car name: %s, cylinders: %d\n",
                vento.getName(), vento.getCylinders()));

        city.startEngine();
        city.accelerate();
        verna.startEngine();
        vento.startEngine();
        verna.accelerate();
        verna.accelerate();
        vento.accelerate();
        city.brake();
        vento.brake();
        verna.brake();
    }
}

