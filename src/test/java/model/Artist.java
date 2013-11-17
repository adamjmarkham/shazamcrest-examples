package model;

public class Artist {
    private final String artist;

    private Artist(String artist) {
        this.artist = artist;
    }

    public static Artist artist(String artist) {
        return new Artist(artist);
    }
}
