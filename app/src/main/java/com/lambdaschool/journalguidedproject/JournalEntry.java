package com.lambdaschool.journalguidedproject;

import android.net.Uri;

import java.io.Serializable;

public class JournalEntry implements Serializable {
    public static final String TAG = "JournalEntry";

    private String date, entryText, image;
    private int dayRating, id;

    public JournalEntry(String date, String entryText, String image, int dayRating, int id) {
        this.date = date;
        this.entryText = entryText;
        this.image = image;
        this.dayRating = dayRating;
        this.id = id;
    }

    public JournalEntry(int id) {
        this.id = id;
        this.date = "";
        this.entryText = "";
        this.image = "";
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntryText() {
        return entryText;
    }

    public void setEntryText(String entryText) {
        this.entryText = entryText;
    }

    public Uri getImage() {
        if(!image.equals("")) {
            return Uri.parse(image);
        } else {
            return null;
        }
    }

    public void setImage(Uri imageUri) {
        this.image = imageUri.toString();
    }

    public int getDayRating() {
        return dayRating;
    }

    public void setDayRating(int dayRating) {
        this.dayRating = dayRating;
    }

    public int getId() {
        return id;
    }
}
