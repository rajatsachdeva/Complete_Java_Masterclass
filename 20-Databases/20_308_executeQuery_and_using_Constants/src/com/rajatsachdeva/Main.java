package com.rajatsachdeva;

import javax.swing.table.TableModel;
import java.sql.*;

public class Main {
    // Creating some constants for sql queries
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_NAME = "jdbc:sqlite:/Users/rohanrajat/Documents" +
            "/Java/Udemy/CompleteJavaMasterClass/Complete_Java_Masterclass" +
            "/20-Databases/20_307_JDBC_Insert_Update_Delete/" +
            DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_NAME);
            // conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            // Create table only if it does not exists to avoid "table already exists" Exception
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            // insert data in table contacts
            insertContact(statement, "Rohan", 2345672, "rohan@mymail.com");
            insertContact(statement, "Dog", 878978, "dog@mymail.com");
            insertContact(statement, "Cat", 98989, "cat@mymail.com");
            insertContact(statement, "Rajat", 1234567, "rajat@mymail.com");

            // Update Rohan's phone number
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + "=5566789 WHERE " +
                    COLUMN_NAME + " ='Rohan'");

            // Delete Cat record
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " ='Cat'");

            // statement.execute returns a boolean that if it was successful
            //statement.execute("SELECT * FROM contacts");

            // Only one active ResultSet is associated with one query
            //ResultSet results = statement.getResultSet();

            // Easy way to perform the queries and get the results
            // we will use executeQuery method
            // It's bad practice to access table columns in code using column names rather than
            // column indices (position), as name may change in future
            // Hard coded values can lead to Sql Injection attack
            // To Solve this issue we can use of constants also make use of methods to remove duplicate code
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

            while (results.next()) {
                // We can also retrieve the data using column indices rather than column name
                // As it's faster as well
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getString(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            // Close all the db resources
            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // created method to remove duplicate code
    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" +
                COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "'," + "'" + phone + "', '" + email + "')");
    }
}
