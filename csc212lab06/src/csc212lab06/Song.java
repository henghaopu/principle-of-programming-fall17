/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab06;

/**
 *
 * @author hpu
 */
public class Song {
    
    String title, artist;
    
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    // overriding 
    public String toString() {
        return "Title: " + title + "  Artist: " + artist;
    }
}
