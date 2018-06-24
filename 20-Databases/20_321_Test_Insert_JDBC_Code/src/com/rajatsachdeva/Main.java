package com.rajatsachdeva;

import com.rajatsachdeva.model.Artist;
import com.rajatsachdeva.model.Datasource;
import com.rajatsachdeva.model.SongAritst;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Datasource datasource = new Datasource();

        // open connection to db
        if (!datasource.open()) {
            System.out.println("Cannot open the connection to database.");
            return;
        }
        List<Artist> artists = datasource.queryArtists(4);

        if (artists == null) {
            System.out.println("No artists present now !");
            return;
        }

        for (Artist artist : artists) {
            System.out.println(artist.toString());
        }

        List<String> albums = datasource.queryAlbumsForAritist("Pink Floyd", Datasource.ORDER_BY_DSC);
        System.out.println();
        for (String album : albums) {
            System.out.println(album);
        }
        System.out.println();

        List<SongAritst> songAritsts = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        System.out.println();
        for (SongAritst songAritst : songAritsts) {
            System.out.println(songAritst.toString());
        }
        System.out.println();

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of Songs are: " + count);

        int minId = datasource.getMin(Datasource.TABLE_SONGS);
        System.out.println("Minimum id: " + minId);

        datasource.createViewForSongArtists();

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the song title: ");
        String title = scanner.nextLine();

        songAritsts = datasource.querySongInfoView(title);
        System.out.println("\n* Getting information for songs " + title + "FROM VIEW " +
                Datasource.TABLE_ARTIST_SONG_VIEW);

        if (songAritsts.isEmpty()) {
            System.out.println("Couldn't find the artist for the song " + title);
            return;
        }

        for (SongAritst songAritst : songAritsts) {
            System.out.println(songAritst.toString());
        }*/
        System.out.println();

        datasource.insertSong("Touch of Grey", "Grateful Dead", "In The Dark", 1);
        datasource.insertSong("Like A Rolling Stone", "Bod Dylan", "Bob Dylan's Greatest Hits", 5);
        datasource.insertSong("Bird Dog", "Everly Brothers", "All-Time Greatest Hits", 7);

        datasource.close();
    }
}
