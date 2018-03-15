package com.rajatsachdeva;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();
    // Changing the Implementation from ArrayList to LinkedList
    // It will work as same as before
    //private List<Seat> seats = new LinkedList<>();

    // Making it really generic by making it type of Collection
    // Advantage of using the collection is use to any type of collection classes
    // private Collection<Seat> seats = new LinkedList<>();
    //private Collection<Seat> seats = new HashSet<>();
    //private Collection<Seat> seats = new LinkedHashSet<>();

    /**
     * we get following exception
     * objc[2061]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/bin/java (0x10908f4c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10a0b64e0). One of the two will be used. Which one is undefined.
     * Exception in thread "main" java.lang.ClassCastException: com.rajatsachdeva.Theatre$Seat cannot be cast to java.lang.Comparable
     * at java.util.TreeMap.compare(TreeMap.java:1294)
     * at java.util.TreeMap.put(TreeMap.java:538)
     * at java.util.TreeSet.add(TreeSet.java:255)
     * <p>
     * As TreeSet is below the SortedSet, we can't use that directly
     * We can only use the ones that are below Collections
     */
    //private Collection<Seat> seats = new TreeSet<>();
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {

        /* Binary Search Algorithm */
        int low = 0;
        int high = seats.size() - 1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }

        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    // for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + this.seatNumber + " cancelled");
                return false;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
