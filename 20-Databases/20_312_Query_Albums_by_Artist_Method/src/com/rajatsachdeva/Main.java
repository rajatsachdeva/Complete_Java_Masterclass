package com.rajatsachdeva;

import com.rajatsachdeva.model.Artist;
import com.rajatsachdeva.model.Datasource;

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

        datasource.close();
    }
}
