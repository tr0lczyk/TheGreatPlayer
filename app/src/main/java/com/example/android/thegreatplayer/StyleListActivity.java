package com.example.android.thegreatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StyleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_list);
        Intent intent = getIntent();
        GenreObject genreObject = intent.getParcelableExtra("Boo");
        final ArrayList<SongObject> area = genreObject.getSongsList();

        TextView styles = findViewById(R.id.styles);
        styles.setText(genreObject.getGenreOfMusic());

        SongsAdapter songAdapter = new SongsAdapter(this, area);
        ListView songListView = findViewById(R.id.listView);
        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                SongObject currentSongObject = area.get(position);
                Intent intent = new Intent(StyleListActivity.this, PlayingActivity.class);
                intent.putExtra("Song", currentSongObject.getSongTitle());
                intent.putExtra("Artist", currentSongObject.getMusicianName());
                startActivity(intent);
            }
        });
    }
}
