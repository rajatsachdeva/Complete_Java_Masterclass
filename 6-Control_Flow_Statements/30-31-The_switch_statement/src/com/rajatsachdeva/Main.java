package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;
        // switch statement
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was a 3, or 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was neither 1, 2, 3, 4, or 5");
                break;
        }

        // Challenge
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter was A");
                break;

            case 'B':
                System.out.println("Letter was B");
                break;

            case 'C':
                System.out.println("Letter was C");
                break;

            case 'D':
            case 'E':
                System.out.println("Letter was " + letter);
                break;

            default:
                System.out.println("Character Not Found");
                break;
        }

        // Switch statements with String objects
        // Case sensitive comparision will happen
        String month = "JanUArY";

        switch(month.toLowerCase()) {
            //case "january": we may have to add all the variants but that's not efficient
            case "january":
                System.out.println("JAN");
                break;
            case "may":
                System.out.println("MAY");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
