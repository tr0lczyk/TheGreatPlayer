package com.example.android.thegreatplayer;


import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;


/**
 * Created by Mateusz on 10.03.2018.
 */

public class SongObject implements Parcelable{

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



    //write object values to parcel for storage
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(mMusicianName);
        dest.writeString(mSongTitle);
    }

    //constructor used for parcel
    public SongObject(Parcel parcel){
        mMusicianName = parcel.readString();
        mSongTitle = parcel.readString();
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<SongObject> CREATOR = new Parcelable.Creator<SongObject>(){

        @Override
        public SongObject createFromParcel(Parcel parcel) {
            return new SongObject(parcel);
        }

        @Override
        public SongObject[] newArray(int size) {
            return new SongObject[0];
        }
    };

    //return hashcode of object
    public int describeContents() {
        return hashCode();
    }
}
