package com.rajatsachdeva;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        // using the reserved Name
        // we can use absolute definition
        //java.util.Map<String, String> languages = new HashMap<>();

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already present in map");
        } else {
            languages.put("Java", "A compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic syntax");
        languages.put("Algol", "An algorithmic language");
        //put returns the last value for a key
        System.out.println(languages.put("BASIC", "Beginners All purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println(languages.get("Java"));

        //put returns the last value for a key
        // if you want to only add a value for key you can use contains method
        //System.out.println(languages.put("Java", "this course is about Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        // Value is overwritten for a particular key
        System.out.println(languages.get("Java"));

        // Print out the map contents
        System.out.println("\n=======================================\n");

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
