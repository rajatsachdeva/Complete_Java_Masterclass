package com.rajatsachdeva;

public class City extends Car {
    private int roadServiceMonths;

    public City(int roadServiceMonths) {
        super("City", "FWD", 5, 5, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }
}
