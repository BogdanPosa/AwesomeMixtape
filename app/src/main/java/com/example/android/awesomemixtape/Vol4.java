package com.example.android.awesomemixtape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Vol4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("*Demi Lovato - Confident *", "00:17", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Clooney - Take Me Away *", "03:43", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Royal Deluxe - I'm Gonna Do My Thing *", "07:17", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Dirty Gritty Revival - Big Bad Wolf *", "10:27", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Dirty Gritty Rocky Tasty - Devil's Stomp *", "12:30", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*David Kos Rolfe - Paper Doll *", "15:23", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Blues Saraceno - Bad Man *", "17:47", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Cage The Elephant - Ain't No Rest For The Wicked *", "21:10", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*David Bowie - Fame *", "24:06 ", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Fujiya & Miyagi - Uh!*", "28:22", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*The Black Keys- Howlin' For You *", "31:18", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*The Delta Riggs - Street Signs & Brake Lights *", "34:28", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Beck - Devil's Haircut *", "38:30", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Yogi & Skrillex - Burial (feat. Pusha T, Moody Good, TrollPhace) *", "41:45", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*The Black Keys - Sinister Kid *", "45:32", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Donna Missal - Point Blank *", "49:17", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));
        songs.add(new Song("*Cage The Elephant - Always Something *", "52:35", "➥ https://www.youtube.com/watch?v=5j8IR6zS8Qo"));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
