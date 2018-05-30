package com.rajatsachdeva;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

    /**
     * Cannot override equals here as parent class definition is final.
     * And final methods cannot be overridden
     */
   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Labrador) {
            String objName = (((Labrador) obj).getName());
            return this.getName().equals(objName);
        }

        return false;
    }*/
}
