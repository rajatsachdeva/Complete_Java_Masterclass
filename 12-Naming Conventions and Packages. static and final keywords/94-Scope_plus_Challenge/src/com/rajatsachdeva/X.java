package com.rajatsachdeva;

public class X {
    private int x;

   public X(int x) {
        this.x = x;
        System.out.println("X is created with value: " + this.x);
    }

    public void printTable() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " * " + x + " = " + this.x * x);
        }
    }
}
