package com.rajatsachdeva;

import com.rajatsachdeva.model.Artist;
import com.rajatsachdeva.model.Datasource;
import com.rajatsachdeva.model.SongAritst;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Datasource datasource = new Datasource();

        // open connection to db
        if(!datasource.open()) {
            System.out.println("Cannot open the connection to database.");
            return;
        }
        List<Artist> artists = datasource.queryArtists(4);

        if(artists  == null) {
            System.out.println("No artists present now !");
            return;
        }

        for (Artist artist: artists) {
            System.out.println(artist.toString());
        }

        List<String> albums = datasource.queryAlbumsForAritist("Pink Floyd", datasource.ORDER_BY_DSC);
        System.out.println();
        for (String album : albums) {
            System.out.println(album);
        }
        System.out.println();

        List<SongAritst> songAritsts = datasource.queryArtistsForSong("Go Your Own Way", datasource.ORDER_BY_ASC);
        System.out.println();
        for (SongAritst songAritst : songAritsts) {
            System.out.println(songAritst.toString());
        }
        System.out.println();

        datasource.querySongsMetadata();

        int count = datasource.getCount(datasource.TABLE_SONGS);
        System.out.println("Number of Songs are: " + count);

        int minId = datasource.getMin(datasource.TABLE_SONGS);
        System.out.println("Minimum id: " + minId);

        datasource.close();
    }
}
