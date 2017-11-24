package com.rajatsachdeva;

public class Dog extends Animal {

    // dog specific characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // base characteristics
//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Over-riding the eat() method
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // Parent Class (Animal) move is called
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        // Over ridden move() is called
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called. Dog moving legs at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.moveLegs() called");
        moveLegs(speed);
        super.move(speed);
    }
}
