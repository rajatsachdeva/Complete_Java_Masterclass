package com.rajatsachdeva;

// Packages

import javafx.scene.Node;
// import org.w3c.dom.Node; // won't compile
// import java.lang.Integer;

public class Main {

    public static void main(String[] args) {

        // whole package is not imported, so we give the actual whole path or full name for class etc.
        // But this will get tiresome
        // Also if we want 2 instances of the Node class then we can't do 2 imports , It won't compile
        // so we may have to use the following type of declaration
        javax.xml.soap.Node node = null;
        org.w3c.dom.Node anotherNode = null;

        Node thirdNode = null; // will take import package Node type, and will work



    }
}
