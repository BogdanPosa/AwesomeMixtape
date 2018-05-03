package com.example.android.awesomemixtape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Vol2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("*Right Behind You Baby*", "00:00 ", "➥ https://soundcloud.com/julianconvex"));
        songs.add(new Song("*Uranium Fever*", "02:24", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Rocket 69*", "04:47", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Whole Latte Shakin' Going On*", "07:30", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Good Rockin Tonight*", "10:20", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Dear Hearts And Gentle People*", "13:21", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Personality*", "15:32", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Accentuate The Positive*", "18:21", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Pistol Packin' Mama *", "21:03", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Sixty Minute Man *", "24:03", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Grandma Plays The Numbers *", "26:34", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Easy Living *", "29:14", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*I Don't Want to Set the World on Fire *", "32:16", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Wonderful Guy *", "35:21", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Civilization *", "37:15", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Mighty, Mighty Man *", "40:20", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Undecided *", "42:53", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Butcher Pete (part 1) *", "46:14", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Anything Goes *", "48:41", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*It's All Over But the Crying *", "51:51", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*Orange Colored Sky *", "54:40", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));
        songs.add(new Song("*The Wanderer *", "57:11", "➥ https://www.youtube.com/watch?v=NdN7CzbkfTE"));



        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
