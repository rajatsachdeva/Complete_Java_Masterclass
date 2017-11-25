package com.rajatsachdeva;

public class EnhancedPlayer {

    // Fields are private cannot be accessed directly
    private String name;
    private int hitPoints = 100; // Define a default value
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        // validation for hitPoints validation
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        } else {
            System.out.println("Health value = " + health + " is not valid."
            + "Initializing with default Health = 100");
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player Knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
