/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

/**
 *
 * @author hpu
 */
public class CompactDisc {
    
    private String upc;
    private double price;
    private String artist;
    private String title;
    
    public CompactDisc(String upc, double price, String artist, String title) {
        this.upc = upc;
        this.price = price;
        this.artist = artist;
        this.title = title;
    }
    
//    public String getUPC() {
//        return upc;
//    }
    
    public String toString() {
        return "Artist: " + artist + " Title: " + title + " Price: " + price;
    }
}
