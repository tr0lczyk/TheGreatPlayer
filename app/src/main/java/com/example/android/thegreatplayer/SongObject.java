package com.example.android.thegreatplayer;


import java.io.Serializable;

public class SongObject implements Serializable{

    private String nameMusician;

    private String titleSong;

    public SongObject(String musicianName, String songTitle){
        nameMusician = musicianName;
        titleSong = songTitle;
    }

    public String getMusicianName(){
        return nameMusician;
    }

    public String getSongTitle(){
        return titleSong;
    }

}
