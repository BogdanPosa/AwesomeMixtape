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

        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));
        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));
        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));
        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));
        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));
        songs.add(new Song("asa","2:2 ","youtube"));
        songs.add(new Song("aa","3:12 ","youtube"));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
