package com.example.android.thegreatplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SongObject> rockSongs = new ArrayList<>();
        int sizeRockSongs = 20;
        for (int i = 0; i < sizeRockSongs; i++) {
            rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        }

        Map<String, List<SongObject>> genreOfSongs = new HashMap<>();
        genreOfSongs.put("Rock", rockSongs);
        genreOfSongs.put("Country", rockSongs);
        genreOfSongs.put("Blues", rockSongs);
        genreOfSongs.put("Jazz", rockSongs);
        genreOfSongs.put("Metal", rockSongs);
        genreOfSongs.put("Funk", rockSongs);
        genreOfSongs.put("Soul", rockSongs);
        genreOfSongs.put("Randb", rockSongs);
        genreOfSongs.put("Pop", rockSongs);
        genreOfSongs.put("Classic", rockSongs);
        genreOfSongs.put("HipHop", rockSongs);
        genreOfSongs.put("Punk rock", rockSongs);
        genreOfSongs.put("Techno", rockSongs);
        genreOfSongs.put("Film", rockSongs);

        final ArrayList<GenreObject> genres = new ArrayList<>();

        for (Map.Entry<String, List<SongObject>> genre : genreOfSongs.entrySet()){
            genres.add(new GenreObject(genre.getKey(),R.drawable.drums, genre.getValue()));
        }

        GenreAdapter adapter = new GenreAdapter(this,genres);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                GenreObject currentGenreObject = genres.get(position);
                Intent intent = new Intent(MainActivity.this, StyleListActivity.class);
                intent.putExtra("Boo", currentGenreObject);
                startActivity(intent);
            }
        });

        ImageButton playlistButton = findViewById(R.id.imageButton2);

        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int position = random.nextInt(14);
                GenreObject defaultGenreObject = genres.get(position);
                Intent intent = new Intent(MainActivity.this, StyleListActivity.class);
                intent.putExtra("Boo", defaultGenreObject);
                startActivity(intent);
            }
        });

        ImageButton playingButton = findViewById(R.id.imageButton3);

        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int position = random.nextInt(14);
                GenreObject genreObject = genres.get(position);
                int position2;
                position2 = random.nextInt(20);
                SongObject songObject = genreObject.getSongsList().get(position2);
                Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
                intent.putExtra("Song",songObject.getSongTitle());
                intent.putExtra("Artist",songObject.getMusicianName());
                intent.putExtra("Boo",genreObject);
                startActivity(intent);
            }
        });
    }
}
