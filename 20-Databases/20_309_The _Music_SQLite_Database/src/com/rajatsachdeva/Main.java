package com.rajatsachdeva;

import com.rajatsachdeva.model.Datasource;

public class Main {

    public static void main(String[] args) {

        Datasource datasource = new Datasource();

        // open connection to db
        if(!datasource.open()) {
            System.out.println("Cannot open the connection to database.");
            return;
        }
        datasource.close();
    }
}
