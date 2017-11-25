package com.rajatsachdeva;

public class Player {

    // now if changed the name of the field
    // Then we need to change everywhere the class
    // field is being used
//    public String name;
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health  = this.health - damage;
        if(this.health <=0) {
            System.out.println("Player Knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaing() {
        return this.health;
    }

}
