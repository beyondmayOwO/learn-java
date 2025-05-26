package ListPartOfObject;

import java.util.ArrayList;

public class Playlist {
    // List as object attribute
    private ArrayList<String> songs;

    // New list is created
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        this.songs.add(song);
    }

    public void removeSong(String song) {
        this.songs.remove(song);
    }

    public void printSongs() {
        for(String song: this.songs) {
            System.out.println(song);
        }
    }
}
