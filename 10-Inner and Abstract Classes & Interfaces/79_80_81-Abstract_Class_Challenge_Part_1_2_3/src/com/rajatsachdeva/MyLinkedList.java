package com.rajatsachdeva;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        // Head at the beginning
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));

            if (comparison < 0) {
                // newItem is greater than current item, move right/ next if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at the end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    //newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less than current item, move left/ previous if possible
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    //newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                    //currentItem.setPrevious(newItem);
                } else {
                    // there is no previous, so insert at the beginning of list only i.e. root of list
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, will not be added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // comparison > 0
                // We are at an item greater than the one to be deleted
                // so item is not in the list
                return false;
            }
        }

        // We have reached the end of the list
        // Without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
