package com.example.android.thegreatplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StyleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_list);

        ArrayList<SongObject> area = this.getIntent().getParcelableExtra("GenreObject");

        SongsAdapter songAdapter = new SongsAdapter(this, area);
        ListView songListView = findViewById(R.id.listView);
        songListView.setAdapter(songAdapter);
    }
}
