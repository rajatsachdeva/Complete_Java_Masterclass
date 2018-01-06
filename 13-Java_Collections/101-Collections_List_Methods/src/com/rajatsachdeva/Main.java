package com.rajatsachdeva;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("IMAX", 8, 12);
        System.out.println("Original");
        printList(theatre.seats);

        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        System.out.println("Copy");
        printList(seatsCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.print("===========================================");;
        System.out.println("===========================================");
    }
}
