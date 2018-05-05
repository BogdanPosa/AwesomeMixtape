package com.example.android.awesomemixtape;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Vol1 extends AppCompatActivity {

    int time = 0;
    Chronometer myChronometer;
    TextView textView2;
    Song song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // creates a list of song objects
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(getString(R.string.Vol1Song1Name), getString(R.string.Vol1Song1StartTime), getString(R.string.Vol1Song1EndTime), getString(R.string.Vol1Song1Source)));
        songs.add(new Song(getString(R.string.Vol1Song2Name), getString(R.string.Vol1Song2StartTime), getString(R.string.Vol1Song2EndTime), getString(R.string.Vol1Song2Source)));
        songs.add(new Song(getString(R.string.Vol1Song3Name), getString(R.string.Vol1Song3StartTime), getString(R.string.Vol1Song3EndTime), getString(R.string.Vol1Song3Source)));
        songs.add(new Song(getString(R.string.Vol1Song4Name), getString(R.string.Vol1Song4StartTime), getString(R.string.Vol1Song4EndTime), getString(R.string.Vol1Song4Source)));
        songs.add(new Song(getString(R.string.Vol1Song5Name), getString(R.string.Vol1Song5StartTime), getString(R.string.Vol1Song5EndTime), getString(R.string.Vol1Song5Source)));
        songs.add(new Song(getString(R.string.Vol1Song6Name), getString(R.string.Vol1Song6StartTime), getString(R.string.Vol1Song6EndTime), getString(R.string.Vol1Song6Source)));
        songs.add(new Song(getString(R.string.Vol1Song7Name), getString(R.string.Vol1Song7StartTime), getString(R.string.Vol1Song7EndTime), getString(R.string.Vol1Song7Source)));
        songs.add(new Song(getString(R.string.Vol1Song8Name), getString(R.string.Vol1Song8StartTime), getString(R.string.Vol1Song8EndTime), getString(R.string.Vol1Song8Source)));
        songs.add(new Song(getString(R.string.Vol1Song9Name), getString(R.string.Vol1Song9StartTime), getString(R.string.Vol1Song9EndTime), getString(R.string.Vol1Song9Source)));
        songs.add(new Song(getString(R.string.Vol1Song10Name), getString(R.string.Vol1Song10StartTime), getString(R.string.Vol1Song10EndTime), getString(R.string.Vol1Song10Source)));
        songs.add(new Song(getString(R.string.Vol1Song11Name), getString(R.string.Vol1Song11StartTime), getString(R.string.Vol1Song11EndTime), getString(R.string.Vol1Song11Source)));
        songs.add(new Song(getString(R.string.Vol1Song12Name), getString(R.string.Vol1Song12StartTime), getString(R.string.Vol1Song12EndTime), getString(R.string.Vol1Song12Source)));
        songs.add(new Song(getString(R.string.Vol1Song13Name), getString(R.string.Vol1Song13StartTime), getString(R.string.Vol1Song13EndTime), getString(R.string.Vol1Song13Source)));
        songs.add(new Song(getString(R.string.Vol1Song14Name), getString(R.string.Vol1Song14StartTime), getString(R.string.Vol1Song14EndTime), getString(R.string.Vol1Song14Source)));
        songs.add(new Song(getString(R.string.Vol1Song15Name), getString(R.string.Vol1Song15StartTime), getString(R.string.Vol1Song15EndTime), getString(R.string.Vol1Song15Source)));
        songs.add(new Song(getString(R.string.Vol1Song16Name), getString(R.string.Vol1Song16StartTime), getString(R.string.Vol1Song16EndTime), getString(R.string.Vol1Song16Source)));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        TextView textView = findViewById(R.id.text);
        textView2 = findViewById(R.id.text2);

        textView.setText(R.string.NowPlayingInfo);
        listView.setAdapter(adapter);


// Handles the click on an item from the list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                song = (Song) parent.getItemAtPosition(position);
// stops the chronometer
                myChronometer.stop();
//updates the Now playing text view based on user selection
                textView2.setText(song.getSongName());

// transforms the duration of the song from string to int
                String text2 = song.getSongStart();
                String[] parts = text2.split(":");
                final String part1 = parts[0]; // minute
                int result1 = Integer.parseInt(part1);
                final String part2 = parts[1]; // seconds
                int result2 = Integer.parseInt(part2);

// calculates the basetime of the Chronometer based of the duration of the selected song
                time = ((result1 * 60 + result2) * 1000);

// sets the time for the Chronometer for the selected song
                myChronometer.setBase(SystemClock.elapsedRealtime() - time);
            }
        });

        myChronometer = findViewById(R.id.chronometer);
        ImageButton buttonStart = findViewById(R.id.play);
        ImageButton buttonStop = findViewById(R.id.pause);
        ImageButton buttonReset = findViewById(R.id.reset);

        //starts the count up of the Chronometer
        buttonStart.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (textView2.getText().equals(getString(R.string.predefinedTextDisplayed))) {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.toastSuggestion);
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    myChronometer.start();
                }
            }
        });

        //stops the count up of the Chronometer
        buttonStop.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                myChronometer.stop();

            }
        });

        //resets the count up of the Chronometer & update the name of the now playing song
        buttonReset.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                myChronometer.setBase(SystemClock.elapsedRealtime());
                textView2.setText(R.string.Vol1Song1Name);
            }
        });

        //stops the count up when the uper limit based on the selected song is reached
        myChronometer
                .setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {

                    @Override
                    public void onChronometerTick(Chronometer chronometer) {
                        if (chronometer.getText().toString().equalsIgnoreCase(song.getSongEnd()))
                            myChronometer.stop();
                    }
                });
    }
}
