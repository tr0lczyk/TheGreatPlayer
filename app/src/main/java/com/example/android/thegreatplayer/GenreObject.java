package com.example.android.thegreatplayer;

/**
 * Created by Mateusz on 07.03.2018.
 */

public class GenreObject {

    private String mGenreOfMusic;

    private int mImgResource;

    public GenreObject(String genreOfMusic, int imgResource ){
        mGenreOfMusic = genreOfMusic;
        mImgResource = imgResource;
    }

    public String getGenreOfMusic(){
        return mGenreOfMusic;
    }

    public  int getImgResource(){
        return mImgResource;
    }
}
