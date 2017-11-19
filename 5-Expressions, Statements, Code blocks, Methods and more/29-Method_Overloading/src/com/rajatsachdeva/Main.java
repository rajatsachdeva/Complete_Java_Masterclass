package com.rajatsachdeva;

//Method Overloading

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Rajat", 500);
        System.out.println("New score is " + newScore);

        calculateScore(500);
        calculateScore();

        double feet = 1;
        double inches = 0;
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0){
            System.out.println("Invalid parameters");
        } else {
            System.out.println(feet + " feet and " + inches + " inches = "
            + centimeters + " centimeters");
            inches = 24;
        }
        centimeters =  calcFeetAndInchesToCentimeters(inches);
        System.out.println(inches +" inches = " + centimeters + " centimeters");
    }

    public  static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public  static int calculateScore(int score) {
        System.out.println("Unnamed player" + " scored " + score + " points");
        return score * 1000;
    }

    public  static void calculateScore() {
        System.out.println("No Player name , no player score");
    }

    /*
    Need different arguments, not only different return type to have
    different methods
    public  static int calculateScore() {
        System.out.println("No Player name , no player score");
        return 0;
    }
    */

    /*
    Create a method called calcFeetAndInchesToCentimeters
    It needs to have two parameters.
    feet is the first parameter, inches is the 2nd parameter

    You should validate that the first parameter feet is >= 0
    You should validate that the 2nd parameter inches is >=0 and <=12
    return -1 from the method if either of the above is not true

    If the parameters are valid, then calculate how many centimetres
    comprise the feet and inches passed to this method and return
    that value.

    Create a 2nd method of the same name but with only one parameter
    inches is the parameter
    validate that its >=0
    return -1 if it is not true
    But if its valid, then calculate how many feet are in the inches
    and then here is the tricky part
    call the other overloaded method passing the correct feet and inches
    calculated so that it can calculate correctly.
    hints: Use double for your number datatypes is probably a good idea
    1 inch = 2.54cm  and one foot = 12 inches
    use the link I give you to confirm your code is calculating correctly.
    Calling another overloaded method just requires you to use the
    right number of parameters.
    */

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        double centimeters = 0;

        // validate input feet and inches
        if(!(feet >=0 && (inches >= 0 && inches <= 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        // parameters are valid, calculate centimeters
        centimeters = ((feet * 12) + inches) * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        double centimeters = 0;

        // validate input inches
        if(!(inches >=0)) {
            return -1;
        }

        double feet = inches / 12;
        inches = inches % 12;
        centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        return centimeters;
    }
}



