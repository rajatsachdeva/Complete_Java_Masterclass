package com.rajatsachdeva;

public abstract class ListItem {

    // Self referential
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    // To store any type of object
    public Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
