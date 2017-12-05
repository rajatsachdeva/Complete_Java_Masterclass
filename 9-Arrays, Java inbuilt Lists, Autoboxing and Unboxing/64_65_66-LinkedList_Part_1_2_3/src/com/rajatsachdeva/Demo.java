package com.rajatsachdeva;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

        addInOrder(placesToVisit, "Karnal");
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        // Concept of iterator
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // Concept of ListIterator
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
}
