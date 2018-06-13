package com.rajatsachdeva.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    // Database name
    public static final String DB_NAME = "music.db";

    // Connection Name
    public static final String CONNECTION_STRING =
            "jdbc:sqlite:/Users/rohanrajat/Documents/Java/Udemy/" +
            "CompleteJavaMasterClass/Complete_Java_Masterclass/20-Databases/" +
            "20_310_Write_Java_Query_for_Artists/" + DB_NAME;

    // Album table details
    // CREATE TABLE albums (_id INTEGER PRIMARY KEY, name TEXT NOT NULL, artist INTEGER)
    public static final String TABLE_ALBUM = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    // Artists table details
    // CREATE TABLE artists (_id INTEGER PRIMARY KEY, name TEXT NOT NULL)
    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTISTS_ID = "_id";
    public static final String COLUMN_ARTISTS_NAME = "name";

    // Songs table details
    // CREATE TABLE songs (_id INTEGER PRIMARY KEY, track INTEGER, title TEXT NOT NULL, album INTEGER)
    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    private Connection conn;

    /**
     * open()
     *  Open connection to database
     *
     * @return true/false if connection is successful/unsuccessful
     */
    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("Connection Open to " + DB_NAME);
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
            if(conn != null) {
                conn.close();
                System.out.println("Connection Closed to " + DB_NAME);
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtists() {
     /*   Statement statement = null;
        ResultSet results = null;*/

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {

            /*statement = conn.createStatement();
            results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);*/

            List<Artist> artists = new ArrayList<>();
            while (results.next()) {
                // set values from table
                Artist artist = new Artist();
                artist.setId(results.getInt(COLUMN_ARTISTS_ID));
                artist.setName(results.getString(COLUMN_ARTISTS_NAME));

                // Add to array list
                artists.add(artist);
            }
            return artists;

        } catch (SQLException e) { // Now here resources are automatically closed for us
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        } /*finally {     // To remove this finally, we can make first try block to try with resources
            try {
                if(results != null) {
                    results.close();
                    System.out.println("results closed");
                }
            } catch (SQLException e) {
                System.out.println("results close failure: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close(); // closing the statement would infact close the resources, so above is not
                                       // actually required
                    System.out.println("statement closed");
                }
            } catch (SQLException e) {
                System.out.println("statment close failure: " + e.getMessage());
                e.printStackTrace();
            }
        }*/
    }
}

