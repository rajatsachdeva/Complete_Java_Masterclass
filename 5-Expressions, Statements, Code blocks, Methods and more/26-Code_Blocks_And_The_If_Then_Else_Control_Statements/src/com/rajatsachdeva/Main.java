package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }
        System.out.println("This gets executed anyways !");

        score = 1000;
        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        score = 6000;
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but "
            + "greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        score = 800;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // cannot access finalScore as it's out of scope
        //int savedFinalScore = finalScore;

        //Challenge
        /*
         * Print out a score score on the screen with the following
         * score set to 10000
         * levelCompleted set to 8
         * bonus set to 200
         * but make sure the first printout still displays as well
         */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + finalScore);
        }
    }
}
