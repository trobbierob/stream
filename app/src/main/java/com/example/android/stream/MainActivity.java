package com.example.android.stream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /* My view of this app would be streaming underground music from local artists
       so as you change areas, you hear the sounds from that particular city/town.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        int num = rand.nextInt(4)+1;

        if (num == 1) {

            ImageView introImageView = (ImageView) findViewById(R.id.introImage);
            introImageView.setImageResource(R.drawable.a);
        } else if (num == 2) {

            ImageView introImageView = (ImageView) findViewById(R.id.introImage);
            introImageView.setImageResource(R.drawable.b);
        } else if (num == 3) {

            ImageView introImageView = (ImageView) findViewById(R.id.introImage);
            introImageView.setImageResource(R.drawable.c);
        } else {

            ImageView introImageView = (ImageView) findViewById(R.id.introImage);
            introImageView.setImageResource(R.drawable.d);
        }

        // Find the View that shows the Tracks category
        TextView tracks = (TextView) findViewById(R.id.tracks);

        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(MainActivity.this, TrackActivity.class);
                startActivity(tracksIntent);

            }
        });

        // Find the View that shows the Listen category
        TextView listen = (TextView) findViewById(R.id.listen);

        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listenIntent = new Intent(MainActivity.this, ListenActivity.class);
                startActivity(listenIntent);

            }
        });

        // Find the View that shows the Playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);

            }
        });

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumsIntent);

            }
        });
    }
}
