package com.example.android.thegreatplayer;


import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/**
 * Created by Mateusz on 07.03.2018.
 */

public class GenreObject implements Parcelable{

    private String mGenreOfMusic;

    private int mImgResource;

    private List<SongObject> mSongs;

    public GenreObject(String genreOfMusic, int imgResource, List<SongObject> songs ){
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

    public List<SongObject> getSongsList(){
        return mSongs;
    }

    //write object values to parcel for storage
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(mGenreOfMusic);
        dest.writeInt(mImgResource);
        dest.writeList(mSongs);
    }

    //constructor used for parcel
    public GenreObject(Parcel parcel){
        mGenreOfMusic = parcel.readString();
        mImgResource = parcel.readInt();
        mSongs = parcel.readArrayList(null);
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<GenreObject> CREATOR = new Parcelable.Creator<GenreObject>(){

        @Override
        public GenreObject createFromParcel(Parcel parcel) {
            return new GenreObject(parcel);
        }

        @Override
        public GenreObject[] newArray(int size) {
            return new GenreObject[0];
        }
    };

    //return hashcode of object
    public int describeContents() {
        return hashCode();
    }


}
