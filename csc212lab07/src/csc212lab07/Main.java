/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab07;

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

        PlayList p = new PlayList(5);
        Scanner sc = new Scanner(System.in);
        // user's current command
        String command;
        // string typed by the user
        String title;
        String artist;

        System.out.println("Enter a the add, r to remove, d to display, or q to quit");
        command = sc.nextLine();

        while (!command.equals("q")) {
            // interpret command 
            switch (command) {
                case "a":
                    if (!p.isFull()) {
                        System.out.print("Title: ");
                        title = sc.nextLine();
                        System.out.print("Author: ");
                        artist = sc.nextLine();
                        p.add(title, artist);
                    } else {
                        System.out.println("There is no more space to store songs.");
                    }
                    break;
                case "r":
                    // remove a song
                    System.out.print("Title: ");
                    title = sc.nextLine();
                    p.remove(title);
                    break;
                case "d":
                    p.display();
                    break;
                default:
                    break;
            }
            // get the next command 
            System.out.println("Enter a the add, r to remove, d to display, or q to quit");
            command = sc.nextLine();
        }
        System.out.println("Program Ended");
    }

}
