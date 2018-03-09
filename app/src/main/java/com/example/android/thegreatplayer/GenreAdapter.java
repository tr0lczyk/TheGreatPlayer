package com.example.android.thegreatplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 07.03.2018.
 */

public class GenreAdapter extends ArrayAdapter<GenreObject> {

    public GenreAdapter(Activity context, ArrayList<GenreObject> genres){
        super(context,0,genres);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        GenreObject currentGenreObject = getItem(position);

        TextView textView = listItemView.findViewById(R.id.genre_name);
        textView.setText(currentGenreObject.getGenreOfMusic());

        ImageView imageVIew = listItemView.findViewById(R.id.genre_image);
        imageVIew.setImageResource(currentGenreObject.getImgResource());

        

        return listItemView;
    }
}
