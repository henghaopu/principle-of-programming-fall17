/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hpu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("songs.csv");
        Scanner fileScanner = new Scanner(file);
        Song[] songs = new Song[4456];

        for (int i = 0; i < songs.length; i++) {
            String strSongAttributes = fileScanner.nextLine();
            String[] arrSongAttributes = strSongAttributes.split(",");
            String artist = arrSongAttributes[0];
            String title = arrSongAttributes[1];
            String year = arrSongAttributes[2];
            songs[i] = new Song(title, artist, year);
            // testing code (good)
            //System.out.println(songs[i]);
        }

        System.out.println("Welcome to the Music Database");
        System.out.println("Enter a search command (title, artist) or quit:");
        Scanner scanner = new Scanner(System.in);
        String searchCommand = scanner.nextLine();
        while (!searchCommand.equals("quit")) {
            switch (searchCommand) {
                case "title":
                    System.out.println("Enter a word or phrase in the title:");
                    searchCommand = scanner.nextLine();
                    for (int i = 0; i < songs.length; i++) {
                        if (songs[i].getTitle().indexOf(searchCommand) != -1) {
                            System.out.println(songs[i]);
                        }
                    }
                    break;
                case "artist":
                    System.out.println("Enter part or all of the artist name:");
                    searchCommand = scanner.nextLine();
                    for (int i = 0; i < songs.length; i++) {
                        if (songs[i].getArtist().indexOf(searchCommand) != -1) {
                            System.out.println(songs[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            System.out.println("Enter a search command (title, artist) or quit:");
            searchCommand = scanner.nextLine();
        }
        System.out.println("Closing the Music Database");
    }
}
