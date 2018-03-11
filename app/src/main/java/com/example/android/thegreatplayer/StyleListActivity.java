package com.example.android.thegreatplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;

public class StyleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_list);

        ArrayList<SongObject> songList = (ArrayList<SongObject>) getIntent().getSerializableExtra("Array");



    }
}
