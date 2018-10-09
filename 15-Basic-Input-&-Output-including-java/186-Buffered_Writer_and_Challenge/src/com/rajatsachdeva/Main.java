package com.rajatsachdeva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Lecture 106 Adventure Game Challenge
 * ====================================
 *
 * Change the program to allow players to type full words, or phrases, then move to the
 * correct location based upon their input.
 * The player should be able to type commands such as "Go West", "run South", or just "East"
 * and the program with move to the appropriate location if there is one. As at present, an
 * attempt to move in an invalid direction should print a message and remain in the same place.
 *
 * Single Letter commands (N, W, S, E, Q) should still be available
 */

public class Main {

    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         *          <->          5 Forest            [ ^North ]
         *           |              |
         *        2 Hill   <-     1 Road    <->     3 Building
         *           |              |
         *          <-         4 Valley
         */

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true) {
            // will generate a null pointer exception as value doesn't exists for the case of invalid key
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()) {
                System.out.print(exit +", " );
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
