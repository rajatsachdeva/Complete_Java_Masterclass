package com.rajatsachdeva;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //setter
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("caymans") || validModel.equals("civic")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //getter
    public String getModel() {
        return this.model;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
