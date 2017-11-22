package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();

        // porsche = null; gives null pointer exception

        System.out.println("Model is " + porsche.getModel()); // gives null
        porsche.setModel("CaymanS");
        System.out.println("Model is " + porsche.getModel());

        honda.setModel("City");
        System.out.println("Model is " + honda.getModel());
    }
}
