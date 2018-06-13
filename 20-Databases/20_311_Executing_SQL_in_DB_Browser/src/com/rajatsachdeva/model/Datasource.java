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
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    // Artists table details
    // CREATE TABLE artists (_id INTEGER PRIMARY KEY, name TEXT NOT NULL)
    public static final String TABLE_ARTISTS = "artists";

    public static final String COLUMN_ARTISTS_ID = "_id";
    public static final String COLUMN_ARTISTS_NAME = "name";
    public static final int INDEX_ARTISTS_ID = 1;
    public static final int INDEX_ARTISTS_NAME = 2;

    // Songs table details
    // CREATE TABLE songs (_id INTEGER PRIMARY KEY, track INTEGER, title TEXT NOT NULL, album INTEGER)
    public static final String TABLE_SONGS = "songs";

    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";
    public static final int INDEX_SONGS_ID = 1;
    public static final int INDEX_SONGS_TRACK = 2;
    public static final int INDEX_SONGS_TITLE = 3;
    public static final int INDEX_SONGS_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DSC = 3;

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

    public List<Artist> queryArtists(int sortOrder) {

        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if (sortOrder != ORDER_BY_NONE) {
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTISTS_NAME);
            sb.append(" COLLATE NOCASE ");

            if (sortOrder == ORDER_BY_DSC) {
                sb.append("DESC");
            } else {
                // Default Case
                sb.append("ASC");
            }
        }

        System.out.println("Executing : " + sb.toString());

        try (Statement statement = conn.createStatement();
             //ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<Artist> artists = new ArrayList<>();
            while (results.next()) {
                // set values from table
                Artist artist = new Artist();

                // Using index rather than column name
                artist.setId(results.getInt(INDEX_ARTISTS_ID));
                artist.setName(results.getString(INDEX_ARTISTS_NAME));

                // Add to array list
                artists.add(artist);
            }
            return artists;

        } catch (SQLException e) { // Now here resources are automatically closed for us
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}

