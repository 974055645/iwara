package com.xy9860.iwara.data;

import android.graphics.Bitmap;

public class Data {
    private String Auther;
    private String Title;
    private Bitmap Thumbnail;

    public Data(String Auther, String Title, Bitmap Thumbnail) {
        this.Auther = Auther;
        this.Title = Title;
        this.Thumbnail = Thumbnail;
    }

    String getaAuther() {
        return Auther;
    }

    String getaTitle() {
        return Title;
    }

    Bitmap getaThumbnail() { return Thumbnail;}

    public void setaAuther(String Auther) {
        this.Auther = Auther;
    }

    public void setaTitle(String Title) {
        this.Title = Title;
    }

    public void setaThumbnail(Bitmap Thumbnail) {
        this.Thumbnail = Thumbnail;
    }
}