package com.example.android.thegreatplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<GenreObject> genres = new ArrayList<>();

        genres.add(new GenreObject("Rock", R.drawable.drums));
        genres.add(new GenreObject("Country", R.drawable.drums));
        genres.add(new GenreObject("Blues", R.drawable.drums));
        genres.add(new GenreObject("Jazz", R.drawable.drums));
        genres.add(new GenreObject("Metal", R.drawable.drums));
        genres.add(new GenreObject("Funk", R.drawable.drums));
        genres.add(new GenreObject("Soul", R.drawable.drums));
        genres.add(new GenreObject("R&B", R.drawable.drums));
        genres.add(new GenreObject("Pop", R.drawable.drums));
        genres.add(new GenreObject("Classic", R.drawable.drums));
        genres.add(new GenreObject("Hip-hop", R.drawable.drums));
        genres.add(new GenreObject("Punk rock", R.drawable.drums));
        genres.add(new GenreObject("Techno", R.drawable.drums));
        genres.add(new GenreObject("Film",R.drawable.drums));


        GenreAdapter adapter = new GenreAdapter(this,genres);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }
}
