package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String songTitle, double songDuration){
        if (findSong(songTitle) == null){
            this.songs.add(new Song(songTitle,songDuration));
            return true;
        }
        return false;
    }
    private Song findSong(String songTitle){
        for (Song song: this.songs){
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> thePlaylist){
        int index = trackNumber - 1;
            if ((index >= 0) && (index <= this.songs.size())){
                thePlaylist.add(this.songs.get(index));
                return true;
            }
            return false;
        }

    public boolean addToPlayList(String songTitle, LinkedList<Song> thePlayList){
    Song song = findSong(songTitle);
    if (song != null){
            thePlayList.add(song);
            return true;
        }
        return false;
    }


}
