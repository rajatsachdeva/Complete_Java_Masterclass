package com.rajatsachdeva;

import java.util.ArrayList;

public class GroceryList {

    // we need to tell what type of array list will be, ArrayList is a class
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println(item + " added in the list.");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + theItem + " at " + (position + 1) + " position removed");
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
