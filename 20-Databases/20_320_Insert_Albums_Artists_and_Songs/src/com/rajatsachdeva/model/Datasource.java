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
                    "20_320_Insert_Albums_Artists_and_Songs/" + DB_NAME;

    // Album table details
    // CREATE TABLE albums (_id INTEGER PRIMARY KEY, name TEXT NOT NULL, artist INTEGER)
    public static final String TABLE_ALBUMS = "albums";

    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUMS_NAME = "name";
    public static final String COLUMN_ALBUMS_ARTIST = "artist";
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

    // select albums.name from albums inner join artists on albums.artist = artists._id where
    // artists.name = "Carol King" order by albums.name collate nocase asc;
    public static final String QUERY_ALBUMS_BY_ARTIST_NAME_START =
            "SELECT " + TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME + " FROM " +
                    TABLE_ALBUMS + " INNER JOIN " + TABLE_ARTISTS + " ON " +
                    TABLE_ARTISTS + "." + COLUMN_ARTISTS_ID + " = " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUMS_ARTIST + " WHERE " +
                    TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + " = \"";

    public static final String QUERY_ALBUMS_BY_ARTISTS_SORT =
            "\" ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME + " COLLATE NOCASE ";

    /*
        select artists.name, albums.name, songs.track from songs
        inner join albums on songs.album = albums._id
        inner join artists on albums.artist = artists._id
        where songs.title= "Go Your Own Way"
        order by artists.name, albums.name collate nocase asc
     */
    public static final String QUERY_ARTIST_FOR_SONG_START =
            "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME + ", " + TABLE_SONGS +
                    "." + COLUMN_SONGS_TRACK + " FROM " + TABLE_SONGS + " INNER JOIN " +
                    TABLE_ALBUMS + " ON " + TABLE_SONGS + "." + COLUMN_SONGS_ALBUM +
                    " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID + " INNER JOIN " +
                    TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUMS_ARTIST +
                    " = " + TABLE_ARTISTS + "." + COLUMN_ARTISTS_ID +
                    " WHERE " + TABLE_SONGS + "." + COLUMN_SONGS_TITLE + " = \"";

    public static final String QUERY_ARTIST_FOR_SONG_SORT =
            "\" ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME +
                    " COLLATE NOCASE ";

    /**
     * CREATE VIEW IF NOT EXISTS artists_list AS SELECT artists.name AS artist, albums.name AS album,
     * songs.track , songs.title FROM songs
     * INNER JOIN albums ON songs.album = albums._id
     * INNER JOIN artists ON albums.artist = artists._id
     * ORDER BY artists.name, albums.name, songs.track;
     */
    public static final String TABLE_ARTIST_SONG_VIEW = "artists_list";
    public static final String CREATE_ARTIST_FOR_SONG_VIEW = "CREATE VIEW IF NOT EXISTS " +
            TABLE_ARTIST_SONG_VIEW + " AS SELECT " +
            TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + " AS artist, " +
            TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME + " AS album, " +
            TABLE_SONGS + "." + COLUMN_SONGS_TRACK + ", " +
            TABLE_SONGS + "." + COLUMN_SONGS_TITLE +
            " FROM " + TABLE_SONGS +
            " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS + "." + COLUMN_SONGS_ALBUM + " = " +
            TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
            " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUMS_ARTIST + " = " +
            TABLE_ARTISTS + "." + COLUMN_ARTISTS_ID +
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + ", " +
            TABLE_ALBUMS + "." + COLUMN_ALBUMS_NAME + ", " + TABLE_SONGS + "." + COLUMN_SONGS_TRACK;

    //SELECT artist, album, track FROM artists_list WHERE title = "Go Your Own Way"
    public static final String QUERY_VIEW_SONG_INFO = "SELECT artist, album, track FROM " +
            TABLE_ARTIST_SONG_VIEW + " WHERE title = \"";

    // Placeholder statement
    //SELECT artist, album, track FROM artists_list WHERE title = ? ORDER BY ?, ?
    public static final String QUERY_VIEW_SONG_INFO_PREP = "SELECT artist, " + COLUMN_SONGS_ALBUM + ", " +
            COLUMN_SONGS_TRACK + " FROM " +
            TABLE_ARTIST_SONG_VIEW + " WHERE " + COLUMN_SONGS_TITLE + " = ?";

    /**
     * INSERT INTO artists(name) VALUES (?)
     * INSERT INTO albums(name, artist) VALUES (?, ?)
     * INSERT INTO songs(track, title, album) VALUES (?, ?, ?)
     */
    public static final String INSERT_INTO_ARTISTS = "INSERT INTO " + TABLE_ARTISTS + " (" +
            COLUMN_ARTISTS_NAME + ") VALUES(?)";
    public static final String INSERT_INTO_ALBUMS = "INSERT INTO " + TABLE_ALBUMS + " (" +
            COLUMN_ALBUMS_NAME + ", " + COLUMN_ALBUMS_ARTIST + ") VALUES(?, ?)";
    public static final String INSERT_INTO_SONGS = "INSERT INTO " + TABLE_SONGS + " (" +
            COLUMN_SONGS_TRACK + ", " + COLUMN_SONGS_TITLE + ", " + COLUMN_SONGS_ALBUM + ") VALUES (?, ?, ?)";

    /**
     * Constants to Check if any artist/album/songs already exists
     */
    public static final String QUERY_ARTISTS = "SELECT " + COLUMN_ARTISTS_ID + " FROM " + TABLE_ARTISTS
            + " WHERE " + COLUMN_ARTISTS_NAME + " = ?";

    public static final String QUERY_ALBUMS = "SELECT " + COLUMN_ALBUM_ID + " FROM " + TABLE_ALBUMS
            + " WHERE " + COLUMN_ALBUMS_NAME + " = ?";

    private Connection conn;

    private PreparedStatement querySongInfoView;

    private PreparedStatement insertIntoArtists;
    private PreparedStatement insertIntoAlbums;
    private PreparedStatement insertIntoSongs;

    private PreparedStatement queryArtists;
    private PreparedStatement queryAlbums;

    /**
     * open()
     * Open connection to database
     *
     * @return true/false if connection is successful/unsuccessful
     */
    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("Connection Open to " + DB_NAME);
            querySongInfoView = conn.prepareStatement(QUERY_VIEW_SONG_INFO_PREP);

            insertIntoArtists = conn.prepareStatement(INSERT_INTO_ARTISTS, Statement.RETURN_GENERATED_KEYS);
            insertIntoAlbums = conn.prepareStatement(INSERT_INTO_ALBUMS, Statement.RETURN_GENERATED_KEYS);
            insertIntoSongs = conn.prepareStatement(INSERT_INTO_SONGS);

            queryArtists = conn.prepareStatement(QUERY_ARTISTS);
            queryAlbums = conn.prepareStatement(QUERY_ALBUMS);

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
            if (querySongInfoView != null) {
                querySongInfoView.close();
            }

            if (insertIntoArtists != null) {
                insertIntoArtists.close();
            }

            if (insertIntoAlbums != null) {
                insertIntoAlbums.close();
            }

            if (insertIntoSongs != null) {
                insertIntoSongs.close();
            }

            if (queryArtists != null) {
                queryArtists.close();
            }

            if (queryAlbums != null) {
                queryAlbums.close();
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

    public List<String> queryAlbumsForAritist(String artistName, int sortOrder) {
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_NAME_START);
        sb.append(artistName);

        if (sortOrder != ORDER_BY_NONE) {
            sb.append(QUERY_ALBUMS_BY_ARTISTS_SORT);

            if (sortOrder == ORDER_BY_DSC) {
                sb.append("DESC");
            } else {
                // Default Case
                sb.append("ASC");
            }
        } else {
            sb.append("\"");
        }

        System.out.println("Executing : " + sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<String> albums = new ArrayList<>();
            while (results.next()) {
                // set values from table
                String albumName = results.getString(1);

                // Add to array list
                albums.add(albumName);
            }
            return albums;

        } catch (SQLException e) { // Now here resources are automatically closed for us
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<SongAritst> queryArtistsForSong(String songName, int sortOrder) {
        StringBuilder sb = new StringBuilder(QUERY_ARTIST_FOR_SONG_START);
        sb.append(songName);

        if (sortOrder != ORDER_BY_NONE) {
            sb.append(QUERY_ARTIST_FOR_SONG_SORT);

            if (sortOrder == ORDER_BY_DSC) {
                sb.append("DESC");
            } else {
                // Default Case
                sb.append("ASC");
            }
        } else {
            sb.append("\"");
        }

        System.out.println("Executing SQL: " + sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<SongAritst> songAritsts = new ArrayList<>();

            while (results.next()) {
                SongAritst songAritst = new SongAritst();
                songAritst.setArtistName(results.getString(1));
                songAritst.setAlbumName(results.getString(2));
                songAritst.setTrack(results.getInt(3));

                songAritsts.add(songAritst);
            }

            // SELECT COUNT(*) FROM songs

            return songAritsts;

        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void querySongsMetadata() {
        String sql = "SELECT * FROM " + TABLE_SONGS;

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            ResultSetMetaData meta = results.getMetaData();
            int numColumns = meta.getColumnCount();

            System.out.println("\nSCHEMA OF " + TABLE_SONGS + " TABLE\n");
            for (int i = 1; i <= numColumns; i++) {
                System.out.format("Column %d is %s\n", i, meta.getColumnName(i));
            }

        } catch (SQLException e) {
            System.out.println("Query Failed : " + e.toString());
            e.printStackTrace();
        }
    }

    public int getCount(String table) {
        String sql = "SELECT COUNT(*) AS count FROM " + table;

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            int count = results.getInt("count");

            System.out.format("count = %d\n", count);
            return count;

        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

    public int getMin(String table) {
        String sql = "SELECT MIN(_id) FROM " + table;

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            int minId = results.getInt(1);
            return minId;

        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

    public boolean createViewForSongArtists() {
        try (Statement statement = conn.createStatement()) {

            statement.execute(CREATE_ARTIST_FOR_SONG_VIEW);
            System.out.println("View Created");
            return true;

        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public List<SongAritst> querySongInfoView(String title) {
        try {
            querySongInfoView.setString(1, title);
            ResultSet results = querySongInfoView.executeQuery();

            List<SongAritst> songArtists = new ArrayList<>();
            while (results.next()) {
                SongAritst songAritst = new SongAritst();
                songAritst.setArtistName(results.getString(1));
                songAritst.setAlbumName(results.getString(2));
                songAritst.setTrack(results.getInt(3));
                songArtists.add(songAritst);
            }
            return songArtists;
        } catch (SQLException e) {
            System.out.println("Query Failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {

        }
    }
}