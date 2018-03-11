package com.example.android.thegreatplayer;


import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;

import java.io.Serializable;


/**
 * Created by Mateusz on 10.03.2018.
 */

public class SongObject implements Serializable{

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
