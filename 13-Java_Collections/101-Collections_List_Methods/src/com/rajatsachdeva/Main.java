package com.rajatsachdeva;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("IMAX", 8, 12);
        System.out.println("Original");
        printList(theatre.seats);

        /**
         * Method used to copy the seats List to seatsCopy List is known as Shallow Copy
         * It creates an ArrayList containing all elements from the
         * list that were passed to the constructor.
         *
         * So here effectively we have 2 separate ArrayList but with references are two same Seat objects
         */
        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        System.out.println("Copy");
        printList(seatsCopy);

        System.out.println("\nDepicting Case of Shallow Copy");
        seatsCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        /**
         * Following shows these are 2 separate lists but have references to same
         *  Seat objects i.e. 96 seats
         */
        System.out.println("\nReversing the seatsCopy list");
        Collections.reverse(seatsCopy);
        System.out.println("Copy");
        printList(seatsCopy);
        System.out.println("Original");
        printList(theatre.seats);

        System.out.println("\nShuffle the seatsCopy list");
        Collections.shuffle(seatsCopy);
        System.out.println("Copy");
        printList(seatsCopy);
        System.out.println("Original");
        printList(theatre.seats);

        // Get the min and max seat from the list and display
        // Sort order is on the basis of the compareTo method logic
        Theatre.Seat minSeat = Collections.min(seatsCopy);
        System.out.println("\nMinimum Seat: " + minSeat.getSeatNumber());

        Theatre.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("\nMaximum Seat: " + maxSeat.getSeatNumber());

        // Sort the out of order list
        System.out.println("\nSorting the list");
        System.out.println("seatsCopy before Sort");
        printList(seatsCopy);
        System.out.println("seatsCopy after Sort");
        sortList(seatsCopy);
        printList(seatsCopy);

        /**
         * Following gives an out of bound exception, as we need to allocate enough space to Destination list before
         * hand before copying the list
         */
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.print("===========================================");;
        System.out.println("===========================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
