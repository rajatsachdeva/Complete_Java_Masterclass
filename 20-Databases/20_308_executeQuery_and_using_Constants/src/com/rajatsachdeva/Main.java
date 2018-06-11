package com.rajatsachdeva;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection
                    ("jdbc:sqlite:/Users/rohanrajat/Documents" +
                            "/Java/Udemy/CompleteJavaMasterClass/Complete_Java_Masterclass" +
                            "/20-Databases/20_307_JDBC_Insert_Update_Delete/testjava.db");

            // conn.setAutoCommit(false);

            Statement statement = conn.createStatement();

            // Create table only if it does not exists to avoid "table already exists" Exception
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");

            // Insert some values (commented below so that we don't have duplicate entries)
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                    "VALUES('Rohan', '2345672', 'rohan@mymail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                    "VALUES('Dog', '878978', 'dog@mymail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                    "VALUES('Cat', '98989', 'cat@mymail.com')");
//
            // Update Rohan's phone number
            //statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Rohan'");

            // Delete Cat record
            //statement.execute("DELETE FROM contacts WHERE name='Cat'");

            // statement.execute returns a boolean that if it was successful
            //statement.execute("SELECT * FROM contacts");

            // Only one active ResultSet is associated with one query
            //ResultSet results = statement.getResultSet();

            // Easy way to perform the queries and get the results
            // we will use executeQuery method
            // It's bad practice to access table columns in code using column names rather than
            // column indices (position), as name may change in future
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");

            while (results.next()) {
                // We can also retrieve the data using column indices rather than column name
                // As it's faster as well
                System.out.println(results.getString("name") + " " +
                        results.getString("phone") + " " +
                        results.getString("email"));
            }

            // Close all the db resources
            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
