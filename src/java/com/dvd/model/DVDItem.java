/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvd.model;

/**
 *
 * @author user
 */
public class DVDItem {
    private String title;
    private String year;
    private String genre;
    
    public DVDItem()
    {
        title="NaN";
        year="NaN";
        genre="NaN";
       
    }
    
    public DVDItem(String t, String y, String g)
    {
        title=t;
        year=y;
        genre=g;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
