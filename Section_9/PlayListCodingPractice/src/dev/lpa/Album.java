package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
//        ArrayList<Song> songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song song = new Song(title, duration);
        if(findSong(title) == null){
            this.songs.add(song);
            return true;
        }else{
             return false;
        }
    }
    private Song findSong(String title) {
        for(Song song: this.songs){
            if(song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
            if (trackNumber>0
                    && this.songs.size() > trackNumber -1
                    && !playList.contains(this.songs.get(trackNumber-1))) {
                playList.add(this.songs.get(trackNumber-1));
                return true;
            } else {
                return false;
            }
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        for(Song song: this.songs){
            if(findSong(title) != null){
                playList.add(song);
                return true;
            }
        }
        return false;
    }

}
