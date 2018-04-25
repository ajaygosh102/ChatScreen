package com.example.nano.sidchat.chatscreen;

class Movie {
    private String message, time;

    public Movie() {
    }

    public Movie(String message, String time) {
        this.message = message;
        this.time = time;

    }

    public String getTitle() {
        return message;
    }

    public void setTitle(String name) {
        this.message = name;
    }

    public String getYear() {
        return time;
    }

    public void setYear(String year) {
        this.time = year;
    }


}
