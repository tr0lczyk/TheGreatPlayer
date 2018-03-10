package com.example.android.thegreatplayer;

/**
 * Created by Mateusz on 10.03.2018.
 */

public class SongObject {

    private String mMusicianName;

    private String mSongTitle;

    public SongObject(String musicianName, String songTitle){
        mMusicianName = musicianName;
        mSongTitle = songTitle;
    }

    public String getMusicianName(){
        return mMusicianName;
    }

    public String getSongTitle(){
        return mSongTitle;
    }


}
