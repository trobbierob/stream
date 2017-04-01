package com.example.android.stream;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sogekingu on 11/6/16.
 */

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> track) {
        super(context, 0, track);
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {

        View trackView = convertView;
        if(trackView == null) {
            trackView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
        }

        Track currentTrack = getItem(pos);

        TextView trackNumberView = (TextView) trackView.findViewById(R.id.default_track_number_view);
        trackNumberView.setText(currentTrack.getTrackNumber());

        TextView trackNameView = (TextView) trackView.findViewById(R.id.default_track_name_view);
        trackNameView.setText(currentTrack.getTrackName());

        return trackView;
    }
}