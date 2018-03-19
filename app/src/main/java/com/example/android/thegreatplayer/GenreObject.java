package com.example.android.thegreatplayer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class GenreObject implements Parcelable{

    private String musicGenre;

    private int resourceImg;

    private List<SongObject> songsList;

    public GenreObject(String genreOfMusic, int imgResource, List<SongObject> songs ){
        musicGenre = genreOfMusic;
        resourceImg = imgResource;
        songsList = songs;
    }

    public String getGenreOfMusic(){
        return musicGenre;
    }

    public  int getImgResource(){
        return resourceImg;
    }

    public List<SongObject> getSongsList(){
        return songsList;
    }

    //write object values to parcel for storage
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(musicGenre);
        dest.writeInt(resourceImg);
        dest.writeList(songsList);
    }

    //constructor used for parcel
    public GenreObject(Parcel parcel){
        musicGenre = parcel.readString();
        resourceImg = parcel.readInt();
        songsList = parcel.readArrayList(SongObject.class.getClassLoader());
    }

    //creator - used when un-parceling our parcel (creating the object)
    public static final Parcelable.Creator<GenreObject> CREATOR = new Parcelable.Creator<GenreObject>(){

        @Override
        public GenreObject createFromParcel(Parcel parcel) {
            return new GenreObject(parcel);
        }

        @Override
        public GenreObject[] newArray(int size) {
            return new GenreObject[size];
        }
    };

    //return hashcode of object
    public int describeContents() {
        return hashCode();
    }


}
