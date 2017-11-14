package com.rajatsachdeva;

import java.util.ResourceBundle;

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
        if( (topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (topScore < 100))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        // boolean case
        boolean isCar = false;
        // there is no error here, boolean assignment results in true
        // so need to care while using == operator
        if(isCar = true)
            System.out.println("This should not happen");

        // Ternary operator
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar = " + wasCar);

        // Challenge
        /* 1. Create a double variable with the value 20
         * 2. Create a second variable of type double with value 80
         * 3. Add both numbers up and multiply by 25
         * 4. Use the remainder operator to figure out the remainder from the
         * sum of #3 divided by 40
         * 5. Write an "if" statement that displays a message "Total was over the
         * limit" if the remaining total (#4) is equal to 20 or less
         */

        double firstDouble = 20d;
        double secondDouble = 80d;
        double resultDouble = ((firstDouble + secondDouble) * 25) % 40 ;

        if (resultDouble <= 20)
            System.out.println("Total was over the limit");



    }
}
