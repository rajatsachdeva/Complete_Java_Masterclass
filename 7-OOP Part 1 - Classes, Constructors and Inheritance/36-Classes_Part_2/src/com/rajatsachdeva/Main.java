package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        // porsche = null; gives null pointer exception
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("CaymanS");
        System.out.println("Model is " + porsche.getModel());
    }
}
