package com.rajatsachdeva;

public class City extends Car {
    private int roadServiceMonths;

    public City(int roadServiceMonths) {
        super("City", "FWD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    // rate is difference in speed from current speed
    // can be positive or Negative
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            setCurrentGear(1);
        } else if(newVelocity > 0 && newVelocity <=10) {
            setCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <=20) {
            setCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <=30) {
            setCurrentGear(3);
        } else {
            setCurrentGear(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
