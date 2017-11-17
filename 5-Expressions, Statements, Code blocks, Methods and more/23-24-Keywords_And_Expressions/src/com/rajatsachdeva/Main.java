package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        int int2 = 5;
        //false, true, null

        // a mile is equal to 1.609344 kilometers
        double mile = 100;
        double kilometers = (mile * 1.609344);
        System.out.println(mile +" miles is equal to " +
                    kilometers + " kilometers");

        int highScore  = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //In the following code , write down what parts of the code are expressions
        int score = 100;    // expression
        if(score > 50 /* expression */) {
            System.out.println("You got the high score !"/* expression */);
            score = 0; //expression
        }
    }
}
