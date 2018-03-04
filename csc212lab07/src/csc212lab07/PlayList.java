/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab07;

/**
 *
 * @author hpu
 */
public class PlayList {
    
    private Song[] songs;
    // used to keep track of how many array positions have been filled
    private int filled = 0;
    // constructor
    public PlayList(int size) {
        songs = new Song[size];
    }
    
    public boolean isFull() {
        return (filled >= songs.length);
    }
    // scan the array looking for the first empty position (indicated by null)
    public void add(String t, String a) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                songs[i] = new Song(t, a);
                filled ++;
                break;  // leave the for loop
            }
        }
    }
    
    public void display() {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null) {
                System.out.println(songs[i]);
            }
        }
    }
    
    public void remove(String t) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null) {
                if (songs[i].getTitle().equals(t)) {
                    songs[i] = null;
                    filled --;
                    break;
                }
                
            }
        }
    }
}
