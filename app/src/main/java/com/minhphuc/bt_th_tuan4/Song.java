package com.minhphuc.bt_th_tuan4;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private String single;
    private int imgSong;
    private int resourece;

    public Song(String title, String single, int imgSong, int resourece) {
        this.title = title;
        this.single = single;
        this.imgSong = imgSong;
        this.resourece = resourece;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public int getImgSong() {
        return imgSong;
    }

    public void setImgSong(int imgSong) {
        this.imgSong = imgSong;
    }

    public int getResourece() {
        return resourece;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", single='" + single + '\'' +
                ", imgSong=" + imgSong +
                ", resourece=" + resourece +
                '}';
    }

    public void setResourece(int resourece) {
        this.resourece = resourece;
    }
}
