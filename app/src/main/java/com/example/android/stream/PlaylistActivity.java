package com.example.android.stream;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class PlaylistActivity extends AppCompatActivity {

    /*
        Truthfully, I'm not sure how I'd like playlists to play out.
        I want the music to be as local as possible, but I also think
        it would be great if people could bring their favorite songs
        along with them. These playlists may end up being local playlists.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

    }
}
