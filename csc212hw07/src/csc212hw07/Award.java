/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

/**
 *
 * @author hpu
 */
public class Award {
    
    private String title;
    private int year;
    private String league;
    
    
    public Award(String title, int year, String league) {
        this.title = title;
        this.year = year;
        this.league = league;
    }
    
    public String toString() {
        return year + " " + league + " " + title;
    }
}
