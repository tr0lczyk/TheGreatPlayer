package com.example.android.thegreatplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class SongsAdapter extends ArrayAdapter<SongObject> {

    public SongsAdapter(Activity context, List<SongObject> songList){
        super(context,0,songList);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        SongObject currentSongObject = getItem(position);

        TextView artistSong = listItemView.findViewById(R.id.artisto);
        artistSong.setText(currentSongObject.getMusicianName());

        TextView titleSong = listItemView.findViewById(R.id.titleOfSong);
        titleSong.setText(currentSongObject.getSongTitle());

        return listItemView;
    }
}
