package com.rajatsachdeva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (null == findSong(title)) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    // Use of for each loop
    // Array list is iterable
    public Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

//     Old approach
//    public Song findSong(String title) {
//        Song song;
//        for(int i = 0; i < songs.size(); i++) {
//            song = songs.get(i);
//            if(song.getTitle().equals(title)) {
//                return song;
//            }
//        }
//        return null;
//    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);

        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album");
        return false;
    }


}
