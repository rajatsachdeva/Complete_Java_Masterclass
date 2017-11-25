package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();

        // what if Initialisation is missed ?
        player.health = 100;
//        player.name = "Rajat";
        player.fullName = "Rajat";
        player.weapon = "Sword";

        int damage = 90;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaing());

        damage = 11;
        // Able to access the health field outside and
        // manipulate the fields directly
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaing());

        System.out.println("\n\nCreating class with encapsulation");
        EnhancedPlayer newPlayer = new EnhancedPlayer("Rajat", 101, "Sword");
        System.out.println("Initial Health = " + newPlayer.getHealth());
    }
}
