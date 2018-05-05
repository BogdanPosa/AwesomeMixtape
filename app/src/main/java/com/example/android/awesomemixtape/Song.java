package com.example.android.awesomemixtape;

public class Song {

    private String mSongName;
    private String mSongStart;
    private String mSongEnd;
    private String mSongSource;

    public Song(String SongName, String SongStart, String SongEnd, String SongSource) {
    mSongName= SongName;
        mSongStart = SongStart;
        mSongEnd = SongEnd;
    mSongSource= SongSource;
}
    public String getSongName(){
    return mSongName;
    }

    public String getSongStart() {
        return mSongStart;
    }

    public String getSongEnd() {
        return mSongEnd;
    }

    public String getSongSource(){
        return mSongSource;
    }

}
