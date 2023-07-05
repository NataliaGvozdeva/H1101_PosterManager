package ru.netology;

public class Poster {
    private String id;
    private String title;
    private int releaseyear;
    private String imageurl;

    public Poster(String id, String title, int releaseyear, String imageurl) {
        this.id = id;
        this.title = title;
        this.releaseyear = releaseyear;
        this.imageurl = imageurl;
    }
}