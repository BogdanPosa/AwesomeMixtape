package com.example.android.awesomemixtape;

public class Song {

    private String mSongName;
    private String mSongDuration;
    private String mSongSource;

public Song (String SongName, String SongDuration, String SongSource){
    mSongName= SongName;
    mSongDuration= SongDuration;
    mSongSource= SongSource;
}
    public String getSongName(){
    return mSongName;
    }

    public String getSongDuration(){
        return mSongDuration;
    }

    public String getSongSource(){
        return mSongSource;
    }

    @Override
    public String toString() {
        return mSongDuration;
    }
}
