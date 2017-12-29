package com.rajatsachdeva;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.print("Enter Number: ");
        this.x = x.nextInt();
        System.out.println("X is created with value: " + this.x);
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " * " + x + " = " + this.x * x);
        }
    }
}
