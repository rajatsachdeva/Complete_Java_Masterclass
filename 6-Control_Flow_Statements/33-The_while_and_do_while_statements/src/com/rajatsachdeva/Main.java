package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        System.out.println("\nwhile: Entry check loop");
        while (true) {
            if (count == 6) {
                System.out.println("Breaking from loop on " + count + " count");
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\ndo while: Exit check loop");
        count = 6;
        // Always going to execute once
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("\nIs " + count + " Prime: " + isEvenNumber(count) + "\n");
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        number = 5;
        finishNumber = 20;
        System.out.println();
        int numberOfEven = 0;
        while (number < finishNumber && numberOfEven != 5) {
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                numberOfEven++;
            }
            number++;
        }
        System.out.println("Total number of even numbers = " + numberOfEven);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
