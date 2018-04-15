package com.example.android.awesomemixtape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Vol1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("*Julian Convex - Impro*","00:00:00 ","➥ https://soundcloud.com/julianconvex"));
        songs.add(new Song("*MAXGONZ - Moon*","00:03:04 ","➥ https://soundcloud.com/maxgonz"));
        songs.add(new Song("*ES.CE - Sweet Donut*","00:06:11 ","➥ https://soundcloud.com/es-ce"));
        songs.add(new Song("*Jazzdrip - Special Place*","00:09:22 ","➥ https://soundcloud.com/jazzdrip"));
        songs.add(new Song("*Alter Ego - Midnight*","00:12:45 ","➥ https://soundcloud.com/user-739456457"));
        songs.add(new Song("*Slam53 - Back In The Days*","00:16:15 ","➥ https://soundcloud.com/slam53"));
        songs.add(new Song("*Jovelli x Feathwr - Lucid Dreams*","00:18:34 ","➥ https://soundcloud.com/thiagojovelli"));
        songs.add(new Song("*Mount Ten - Interference*","00:21:57 ","➥ https://soundcloud.com/mountten"));
        songs.add(new Song("*Jungle52 - Too Much*","00:24:10 ","➥ https://soundcloud.com/jungle52"));
        songs.add(new Song("*Furino - Parisian Rooftops*","00:27:01 ","➥ https://soundcloud.com/furino"));
        songs.add(new Song("*Karmawin - Rough Street*","00:28:55 ","➥ https://soundcloud.com/karmawinlyon"));
        songs.add(new Song("*Mi Ka - A Beat To Chill To*","00:31:56 ","➥ https://soundcloud.com/mikamikachu"));
        songs.add(new Song("*XNimVn - Afro Samurai*","00:34:46 ","➥ https://soundcloud.com/minh-nguyen-61"));
        songs.add(new Song("*Funky Fella - Curvature*","00:36:44 ","➥ https://soundcloud.com/funky_fella"));
        songs.add(new Song("*CORC - No Justice, No Peace*","00:38:48 ","➥ https://soundcloud.com/corccey"));
        songs.add(new Song("*Ash n' Soul - Genius Jazzy Moon*","00:41:51 ","➥ https://soundcloud.com/ashnsoul"));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
