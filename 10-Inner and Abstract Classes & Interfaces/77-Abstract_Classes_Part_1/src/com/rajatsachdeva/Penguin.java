package com.rajatsachdeva;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Oops! Cannot Fly. I can swim instead");
    }
}
