package com.rajatsachdeva;

// Create a Song class having Title and Duration for a song.
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    //To String
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
