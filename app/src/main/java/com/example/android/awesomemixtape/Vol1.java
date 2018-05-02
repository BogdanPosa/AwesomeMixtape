package com.example.android.awesomemixtape;

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

import java.util.ArrayList;

public class Vol1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("*Julian Convex - Impro*", "00:00 ", "➥ https://soundcloud.com/julianconvex"));
        songs.add(new Song("*MAXGONZ - Moon*", "03:04 ", "➥ https://soundcloud.com/maxgonz"));
        songs.add(new Song("*ES.CE - Sweet Donut*", "06:11 ", "➥ https://soundcloud.com/es-ce"));
        songs.add(new Song("*Jazzdrip - Special Place*", "09:22 ", "➥ https://soundcloud.com/jazzdrip"));
        songs.add(new Song("*Alter Ego - Midnight*", "12:45 ", "➥ https://soundcloud.com/user-739456457"));
        songs.add(new Song("*Slam53 - Back In The Days*", "16:15 ", "➥ https://soundcloud.com/slam53"));
        songs.add(new Song("*Jovelli x Feathwr - Lucid Dreams*", "18:34 ", "➥ https://soundcloud.com/thiagojovelli"));
        songs.add(new Song("*Mount Ten - Interference*", "21:57 ", "➥ https://soundcloud.com/mountten"));
        songs.add(new Song("*Jungle52 - Too Much*", "24:10 ", "➥ https://soundcloud.com/jungle52"));
        songs.add(new Song("*Furino - Parisian Rooftops*", "27:01 ", "➥ https://soundcloud.com/furino"));
        songs.add(new Song("*Karmawin - Rough Street*", "28:55 ", "➥ https://soundcloud.com/karmawinlyon"));
        songs.add(new Song("*Mi Ka - A Beat To Chill To*", "31:56 ", "➥ https://soundcloud.com/mikamikachu"));
        songs.add(new Song("*XNimVn - Afro Samurai*", "34:46 ", "➥ https://soundcloud.com/minh-nguyen-61"));
        songs.add(new Song("*Funky Fella - Curvature*", "36:44 ", "➥ https://soundcloud.com/funky_fella"));
        songs.add(new Song("*CORC - No Justice, No Peace*", "38:48 ", "➥ https://soundcloud.com/corccey"));
        songs.add(new Song("*Ash n' Soul - Genius Jazzy Moon*", "41:51 ", "➥ https://soundcloud.com/ashnsoul"));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Now playing");
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                TextView textView = (TextView) view.findViewById(R.id.songName);
                String text = textView.getText().toString();
//                System.out.println("Choosen song = : " + text);
                TextView textView2 = (TextView) findViewById(R.id.text2);
                textView2.setText(text);

                TextView textView3 = (TextView) view.findViewById(R.id.songDuration);
                String text3 = textView3.getText().toString();

//                Setting the timer base time now from button will be changed to take automaticaly from the Song object when selecting one item
//                TODO implement onItemSelect
                String string = text3;
//                String[] parts = string.split(":");
//                final String part1 = parts[0]; // minute
//                final int result1 = Integer.parseInt(part1);
//                final String part2 = parts[1]; // seconds
//                final int result2 = Integer.parseInt(part2);
//                final int time= ((result1 * 60 + result2) * 1000);

                System.out.println("song duration= : " + string);

            }
        });


        final Chronometer myChronometer = findViewById(R.id.chronometer);

        ImageButton buttonStart = findViewById(R.id.play);
        ImageButton buttonStop = findViewById(R.id.pause);
        ImageButton buttonReset = findViewById(R.id.reset);

        buttonStart.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
//                myChronometer.setBase(SystemClock.elapsedRealtime() - time);
                myChronometer.start();
            }
        });

        buttonStop.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                myChronometer.stop();

            }
        });

        buttonReset.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                myChronometer.setBase(SystemClock.elapsedRealtime());

            }
        });

    }


}
