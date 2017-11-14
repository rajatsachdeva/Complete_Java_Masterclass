package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result = " + result);

        result++;
        System.out.println("Result = " + result);

        result--;
        System.out.println("Result = " + result);

        result += 2;
        System.out.println("Result = " + result);

        result *= 10;
        System.out.println("Result = " + result);

        result -= 10;
        System.out.println("Result = " + result);

        result /= 10;
        System.out.println("Result = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100) // boolean expression
            System.out.println("You got the high score!");

        topScore = 99;
        if (topScore != 100) // boolean expression
            System.out.println("You didn't got the high score!");

        topScore = 101;
        if (topScore > 100) // boolean expression
            System.out.println("You got more than the high score!");

        // >= <= == != > <

        topScore = 80;
        int secondTopScore = 60;
        if( topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

    }
}
