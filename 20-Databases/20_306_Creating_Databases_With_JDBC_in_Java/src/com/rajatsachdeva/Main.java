package com.rajatsachdeva;

import sun.plugin2.os.windows.Windows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            /*
            OLD ways
            Class.forName("org.sql.JDBC");
            Windows
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
             Data Source Managers are also used but in enterprise editions
             */
            Connection conn = DriverManager.getConnection
                    ("jdbc:sqlite:/Users/rohanrajat/Documents" +
                            "/Java/Udemy/CompleteJavaMasterClass/Complete_Java_Masterclass" +
                            "/20-Databases/20_306_Creating_Databases_With_JDBC_in_Java/testjava.db");

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
