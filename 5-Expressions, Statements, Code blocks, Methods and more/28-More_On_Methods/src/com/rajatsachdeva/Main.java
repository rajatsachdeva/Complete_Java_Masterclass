package com.rajatsachdeva;

public class Main {

    // main method
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Result
        int highScore = 0;

        /* First call */
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore );

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

	    /* Second Call */
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore );

        gameOver = false;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore );

        /*
        Create a method called displayHighScorePosition
        it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        You should display the players name along with a message like " managed to get into position " and the
        position they got and a further message " on the high score table".

        Create a 2nd method called calculateHighScorePosition
        it should be sent one argument only, the player score
        it should return an in
        the return data should be
        1 if the score is >=1000
        2 if the score is >=500 and < 1000
        3 if the score is >=100 and < 500
        4 in all other cases
        call both methods and display the results of the following
        a score of 1500, 900, 400 and 50
        */
    }

    // calculateScore method
    public static int calculateScore (boolean gameOver, int score,
                                      int levelCompleted, int bonus) {
        int finalScore = -1;
        if(gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
