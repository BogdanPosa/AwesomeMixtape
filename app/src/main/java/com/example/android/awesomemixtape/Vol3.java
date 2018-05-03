package com.example.android.awesomemixtape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Vol3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("*Blue Swede - Hooked On a Feeling*", "00:00 ", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Raspberries - Go All the Way*", "02:52", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Norman Greenbaum - Spirit In the Sky*", "06:13 ", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*David Bowie - Moonage Daydream*", "10:15 ", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Elvin Bishop - Fooled Around and Fell In Love*", "14:57", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*10cc - I'm Not In Love*", "19:31", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Jackson 5 - I Want You Back *", "25:35", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Redbone - Come and Get Your Love*", "28:35", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*The Runaways - Cherry Bomb *", "31:58", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Rupert Holmes - Escape (The Pina Colada Song)*", "34:15", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*The Five Stairsteps - O-O-H Child*", "38:52", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));
        songs.add(new Song("*Marvin Gaye & Tammi Terrell - Ain't No Mountain High Enough*", "42:06", "➥ https://www.youtube.com/watch?v=AoZYaUXmGB8&list=RDAoZYaUXmGB8&t=578"));


        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
