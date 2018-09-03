package com.rajatsachdeva;

import java.sql.*;
import java.util.Map;

public class Buys {

    // Database name
    public static final String DB_NAME = "mydb.db";

    // Connection Name
    public static final String CONNECTION_STRING =
            "jdbc:sqlite:/Users/rohanrajat/Documents/Java/Udemy/" +
                    "CompleteJavaMasterClass/Complete_Java_Masterclass/" +
                    "JSON/" + DB_NAME;

    // Create Table
    public static final String TABLE_NAME = "buys_heading";
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +
            " (_id INTEGER PRIMARY KEY, heading_name TEXT NOT NULL)";

    public static final String INSERT_INTO = "INSERT INTO " + TABLE_NAME + " (" +
            "_id, heading_name ) VALUES(?, ?)";

    private Connection conn;
    private PreparedStatement insertIntoHeadings;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("Connection Open to " + DB_NAME);

//            Statement statement = conn.createStatement();
//            statement.execute(CREATE_TABLE);
//            statement.close();
            insertIntoHeadings = conn.prepareStatement(INSERT_INTO, Statement.RETURN_GENERATED_KEYS);

            return true;
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * close()
     * close the connection to database if it exists
     */
    public void close() {
        try {

            if(insertIntoHeadings != null){
                insertIntoHeadings.close();
            }
            if (conn != null) {
                conn.close();
                System.out.println("Connection Closed to " + DB_NAME);
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void insertIntoHeading(Proposal obj) throws SQLException{
        Map<String, Map<String, String>> Buys = obj.getBuys();
        int count = 1;

        for(String headingkey: Buys.keySet()){
            insertIntoHeadings.setInt(1, count);
            insertIntoHeadings.setString(2, headingkey);
            int affectedRows = insertIntoHeadings.executeUpdate();
            count++;

        }

    }

}
