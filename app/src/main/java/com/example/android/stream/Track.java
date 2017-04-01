package com.example.android.stream;

/**
 * Created by Sogekingu on 11/6/16.
 */

public class Track {

    private String mTrackName;

    private String mTrackNumber;

    public Track(String trackNumber, String trackName){

        mTrackNumber = trackNumber;
        mTrackName = trackName;

    }

    public String getTrackNumber() {

        return mTrackNumber;

    }

    public String getTrackName() {

        return mTrackName;

    }

}
