package com.rajatsachdeva;

import com.sun.javafx.collections.ListListenerHelper;

import java.util.*;

public class Demo {
    // psvm short cut for creating main
    public static void main(String[] args) {
        // create a linked list
        LinkedList<String> placesToVisit = new LinkedList<String>();

//        placesToVisit.add("Delhi");
//        placesToVisit.add("Ambala");
//        placesToVisit.add("Chandigarh");
//        placesToVisit.add("Shimla");
//        placesToVisit.add("Kullu");
//        placesToVisit.add("Manali");
//        placesToVisit.add("Rotang");
//        placesToVisit.add("Leh");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Karnal");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4); // remove shimla
//        printList(placesToVisit);


        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Ambala");
        addInOrder(placesToVisit, "Chandigarh");
        addInOrder(placesToVisit, "Shimla");
        addInOrder(placesToVisit, "kullu");
        addInOrder(placesToVisit, "Manali");
        addInOrder(placesToVisit, "Rotang");
        addInOrder(placesToVisit, "Leh");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Karnal");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    // print the linkedList
    private static void printList(LinkedList<String> linkedList) {
        // Concept of iterator
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");
    }

    // add in lexicographic order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // Concept of ListIterator
        // NOTE:
        // When you create ListIterator then it does not automatically pointing to first record
        // so, we need to use stringListIterator.next() to point to first record.
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {

            int comparison = stringListIterator.next().compareTo(newCity);
            if (0 == comparison) {
                // equal, do not add already present
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this one
                // Delhi -> Ambala > 0
                // Ambala should be added first
                // Java has implemented LinkedList as Double Linked list so we have reference to next and previous both
                stringListIterator.previous(); // go to previous record
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on to next city
            }
        }
        stringListIterator.add(newCity);
        return  true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        // Don't use following check not good practice
//
//        if(cities.getFirst() == "") {
//
//        }

        // check if cities list is empty
        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            // printing the first entry
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // to take care of enter key
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached Start of list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

                default:
                    System.out.println("Wrong choice. Please enter 0-3");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available Actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
