package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("IMAX", 8, 12);
        theatre.getSeats();

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken or there is no such seat");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
