/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab06;

import java.util.Scanner;

/**
 *
 * @author hpu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String line;
        int request = 0;
        Scanner kb = new Scanner(System.in);
        Song[] playList = new Song[5];
        String userTitle, userArtist;

        for (int i = 0; i < playList.length; i++) {
            // ask the user for a title 
            System.out.println("Enter song " + i + " title:");
            userTitle = kb.nextLine();
            // ask the user for an artist 
            System.out.println("Enter song " + i + " artist:");
            userArtist = kb.nextLine();

            //try {
                // call the Song constructor and assign to array element
                playList[i] = new Song(userTitle, userArtist);
            //} catch (ArrayIndexOutOfBoundsException e) {
                //System.out.println(e.toString());
            //}
        }

        System.out.println("Enter a song number (0-4), or q to quit:");
        line = kb.nextLine();

        while (!line.equals("q")) {
            try {
                request = Integer.parseInt(line);
                System.out.println("Song" + request + ":" + playList[request]);

                // fill this in
                playList[request].toString();
                System.out.println("Enter a song number (0-4), or q to quit:");
                line = kb.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
                break;
            }
        }
    }
}
