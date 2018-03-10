package com.example.android.thegreatplayer;

import java.util.ArrayList;

/**
 * Created by Mateusz on 07.03.2018.
 */

public class GenreObject {

    private String mGenreOfMusic;

    private int mImgResource;

    private ArrayList<SongObject> mSongs;

    public GenreObject(String genreOfMusic, int imgResource, ArrayList<SongObject> songs ){
        mGenreOfMusic = genreOfMusic;
        mImgResource = imgResource;
        mSongs = songs;
    }

    public String getGenreOfMusic(){
        return mGenreOfMusic;
    }

    public  int getImgResource(){
        return mImgResource;
    }

    public ArrayList<SongObject> getSongsList(){
        return mSongs;
    }
}
