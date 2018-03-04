/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

/**
 *
 * @author hpu
 */
public class Song {
    
    private String title, artist, year;
    
    public Song(String title, String artist, String year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String toString() {
        return artist + ":" + title + ":" + year;
    }
}
