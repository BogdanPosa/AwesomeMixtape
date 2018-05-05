package com.example.android.awesomemixtape;

public class Song {

    private String mSongName;
    private String mSongDuration;
    private String mSongEnd;
    private String mSongSource;

    public Song(String SongName, String SongDuration, String SongEnd, String SongSource) {
    mSongName= SongName;
    mSongDuration= SongDuration;
        mSongEnd = SongEnd;
    mSongSource= SongSource;
}
    public String getSongName(){
    return mSongName;
    }

    public String getSongDuration(){
        return mSongDuration;
    }

    public String getSongEnd() {
        return mSongEnd;
    }

    public String getSongSource(){
        return mSongSource;
    }

}
