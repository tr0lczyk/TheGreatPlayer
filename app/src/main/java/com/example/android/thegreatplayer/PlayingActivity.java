package com.example.android.thegreatplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_now);

        TextView song = findViewById(R.id.songTitle);
        TextView artist = findViewById(R.id.songArtist);

        Bundle extras = getIntent().getExtras();

        song.setText(extras.getString("Song"));
        artist.setText(extras.getString("Artist"));

    }
}
