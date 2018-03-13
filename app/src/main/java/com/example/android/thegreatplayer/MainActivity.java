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
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SongObject> rockSongs = new ArrayList<>();
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        rockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> countrySongs = new ArrayList<>();
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        countrySongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> bluesSongs = new ArrayList<>();
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));
        bluesSongs.add( new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> jazzSongs = new ArrayList<>();
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        jazzSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> metalSongs = new ArrayList<>();
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        metalSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));


        ArrayList<SongObject> funkSongs = new ArrayList<>();
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        funkSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));


        ArrayList<SongObject> soulSongs = new ArrayList<>();
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        soulSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> randbSongs = new ArrayList<>();
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        randbSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));


        ArrayList<SongObject> popSongs = new ArrayList<>();
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        popSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> classicSongs = new ArrayList<>();
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        classicSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> hiphopSongs = new ArrayList<>();
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        hiphopSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));


        ArrayList<SongObject> punkRockSongs = new ArrayList<>();
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        punkRockSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));


        ArrayList<SongObject> technoSongs = new ArrayList<>();
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        technoSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));

        ArrayList<SongObject> filmSongs = new ArrayList<>();
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));
        filmSongs.add(new SongObject("Nirvana", "Smells Like Teen Spirit"));




        final ArrayList<GenreObject> genres = new ArrayList<>();

        genres.add(new GenreObject("Rock", R.drawable.drums, rockSongs));
        genres.add(new GenreObject("Country", R.drawable.drums, countrySongs));
        genres.add(new GenreObject("Blues", R.drawable.drums,bluesSongs));
        genres.add(new GenreObject("Jazz", R.drawable.drums, jazzSongs));
        genres.add(new GenreObject("Metal", R.drawable.drums, metalSongs));
        genres.add(new GenreObject("Funk", R.drawable.drums, funkSongs));
        genres.add(new GenreObject("Soul", R.drawable.drums, soulSongs));
        genres.add(new GenreObject("R&B", R.drawable.drums, randbSongs));
        genres.add(new GenreObject("Pop", R.drawable.drums, popSongs));
        genres.add(new GenreObject("Classic", R.drawable.drums, classicSongs));
        genres.add(new GenreObject("Hip-hop", R.drawable.drums, hiphopSongs));
        genres.add(new GenreObject("Punk rock", R.drawable.drums, punkRockSongs));
        genres.add(new GenreObject("Techno", R.drawable.drums, technoSongs));
        genres.add(new GenreObject("Film",R.drawable.drums, filmSongs));


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
                int position = 0;
                Random random = new Random();
                position = random.nextInt(14);
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
                int position = 0;
                Random random = new Random();
                position = random.nextInt(14);
                GenreObject genreObject = genres.get(position);
                int position2 = 0;
                position2 = random.nextInt(20);
                SongObject songObject = genreObject.getSongsList().get(position2);
                Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
                intent.putExtra("Song",songObject.getSongTitle());
                intent.putExtra("Artist",songObject.getMusicianName());
                startActivity(intent);
            }
        });
    }
}
