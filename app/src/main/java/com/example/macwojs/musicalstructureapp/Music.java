package com.example.macwojs.musicalstructureapp;

public class Music {

    private String mTitle;
    private String mArtist;
    private int mSrc;

    public Music(String Title, String Artist, Integer Src) {
        mTitle = Title;
        mArtist = Artist;
        mSrc = Src;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public Integer getmSrc() {
        return mSrc;
    }
}
