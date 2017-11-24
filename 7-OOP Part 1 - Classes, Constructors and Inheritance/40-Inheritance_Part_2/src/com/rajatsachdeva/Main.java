package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1 , 5, 5);

        Dog dog = new Dog("YorkiE", 8, 20, 2, 4,
                1, 20, "long silky");

        dog.eat();
        System.out.println();
        dog.walk();
        System.out.println();
        dog.run();

        System.out.println();
        Fish fish = new Fish("Nemo", 1, 10,
                2, 2, 3);

        fish.swim(10);
    }
}
