package com.rajatsachdeva;

/*
    Abstract Class/Method
    Meaning Something that is only declared (What needs to be done ?)
    and not defined (How it needs to be done ?)

    Interfaces are abstract

    Abstract Class cannot be Instantiated
*/
public class Main {

    public static void main(String[] args) {

        // Dog
        Dog dog = new Dog("Oscar");
        dog.breathe();
        dog.eat();

        System.out.println("\n******************************\n");

        // Bird: Parrot
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("\n******************************\n");

        // Bird: Penguin
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
