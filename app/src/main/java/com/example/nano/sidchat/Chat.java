package com.example.nano.sidchat;

class Chat {

    // Store the id of the  movie poster
    private int mImageDrawable;
    // Store the name of the movie
    private String mName;
    // Store the release date of the movie
    private String mRelease;

    private String mReleaseyear;

    // Constructor that is used to create an instance of the Movie object
    public Chat(int mImageDrawable, String mName, String mRelease, String mReleaseyear) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
        this.mReleaseyear = mReleaseyear;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }

    public String getmReleaseyear() {
        return mReleaseyear;
    }

    public void setmReleaseyear(String mReleaseyear) {
        this.mReleaseyear = mReleaseyear;
    }
}
