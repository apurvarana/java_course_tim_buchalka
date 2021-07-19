package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String songTitle, double songDuration){
        return this.songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> thePlaylist){
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null){
            thePlaylist.add(checkedSong);
            return true;
        }
            return false;
        }

    public boolean addToPlayList(String songTitle, LinkedList<Song> thePlayList){
    Song song = songs.findSong(songTitle);
    if (song != null){
            thePlayList.add(song);
            return true;
        }
        return false;
    }
    private class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }
        private Song findSong(String songTitle){
            for (Song song: this.songs){
                if (song.getTitle().equals(songTitle)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }


}
