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

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         *          <->          5 Forest            [ ^North ]
         *           |              |
         *        2 Hill   <-     1 Road    <->     3 Building
         *           |              |
         *          <-         4 Valley
         */

        // Create temporary map that will be taken as input in constructor while defining the exits for a location
        // Add exit for 1 Road
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExit));
        // As there are no exits, but generates an exception
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
//        tempExit.put("Q", 0);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building ",tempExit));

        // Add exit for 2 Hill
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
//        tempExit.put("Q", 0);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        // Add exit for 3 Building
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
//        tempExit.put("Q", 0);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        // Add exit for 4 Valley
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
//        tempExit.put("Q", 0);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        // Add exit for 5 Forest
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
//        tempExit.put("Q", 0);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

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
            tempExit.remove("S");
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

//            loc = scanner.nextInt();
//            if (!locations.containsKey(loc)) {
//                System.out.println("You cannot go in that direction");
//            }
        }

        // Usage of split method under String Class
        /*String[] road = "You are standing at the end of a road before a small brick building".split(" ");
        for (String i: road) {
            System.out.println(i);
        }

        System.out.println("=====================================================");

        String[] building = "You are inside a building, a well house for a small spring".split(", ");
        for (String i: building) {
            System.out.println(i);
        }*/
    }
}
