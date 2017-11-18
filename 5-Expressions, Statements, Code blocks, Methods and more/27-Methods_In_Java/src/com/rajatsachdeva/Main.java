package com.rajatsachdeva;

public class Main {

    // main method
    public static void main(String[] args) {

        /* First call */
	    calculateScore(true, 800, 5, 100);
	    
	    /* Second Call */
        calculateScore(true,10000, 8, 200 );
    }

    // calculateScore method
    public static void calculateScore (boolean gameOver, int score,
                                       int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore );
        }
    }
}
