package com.example.android.thegreatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_now);

        TextView song = findViewById(R.id.songTitle);
        TextView artist = findViewById(R.id.songArtist);

        Bundle extras = getIntent().getExtras();

        final GenreObject genreObject = getIntent().getParcelableExtra("Boo");

        song.setText(extras.getString("Song"));
        artist.setText(extras.getString("Artist"));

        ImageButton genresButton = findViewById(R.id.imageButton);

        genresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton playlistButton = findViewById(R.id.imageButton2);

        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayingActivity.this, StyleListActivity.class);
                intent.putExtra("Boo",genreObject);
                startActivity(intent);
            }
        });
    }
}
