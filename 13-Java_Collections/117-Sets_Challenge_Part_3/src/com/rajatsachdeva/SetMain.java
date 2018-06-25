package com.rajatsachdeva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        // Bulk operations are destructive i.e. they tend to modify the input they work on
        // so we will using a copy of the inputs

        // Union
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        // Intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and cube of " + Math.cbrt(i));
        }

        System.out.println();
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        System.out.print("\nnature: ");
        printSet(nature);

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));
        System.out.print("\ndivine: ");
        printSet(divine);

        // Set Differences are asymmetric
        System.out.print("\nnature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.print("\ndivine - nature: ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        System.out.print("\nnature union divine: ");
        printSet(unionTest);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        System.out.print("\nnature intersection divine: ");
        printSet(intersectionTest);

        System.out.print("\nSymmetric difference: ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        // Check if one set is superset of other containsAll method and is not destructive like other bulk operations
        if (nature.containsAll(divine)) {
            System.out.println("\ndivine is a subset of nature");
        }

        if (nature.containsAll(intersectionTest)) {
            System.out.println("\nintersectionTest is subset of nature");
        }

        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is subset of divine");
        }
    }

    private static void printSet(Set<String> set) {
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}