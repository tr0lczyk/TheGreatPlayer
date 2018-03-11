package com.example.android.thegreatplayer;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Mateusz on 11.03.2018.
 */

public class SongsAdapter extends ArrayAdapter<SongObject> {


    public SongsAdapter(Activity context, ArrayList<SongObject> songList){
        super(context,0,songList);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.playing_now,parent,false);
        }


        return super.getView(position, convertView, parent);
    }
}
