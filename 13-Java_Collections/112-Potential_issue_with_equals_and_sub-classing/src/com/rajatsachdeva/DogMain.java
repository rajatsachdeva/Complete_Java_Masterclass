package com.rajatsachdeva;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover)); // true, as Labrador is instance/ sub-class of Dog
        System.out.println(rover.equals(rover2)); // false, But Dog is not instance of Labrador
        // But in second run when equals definition is removed from sub-class (Labrador) then it gives same result as
        // true


        // So, this violates the symmetric property of equals which should be fulfilled
    }
}
