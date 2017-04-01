package com.example.android.stream;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        ArrayList<Track> tracks = new ArrayList<Track>();

        Random rand = new Random();
        int num = rand.nextInt(40)+10;


        for (int i = 1; i < num; i++) {

            tracks.add(new Track("Track " + i, "Track Name"));

        }

        TrackAdapter adapter = new TrackAdapter(this, tracks);
        ListView listView = (ListView) findViewById(R.id.activity_track);
        listView.setAdapter(adapter);

    }
}
