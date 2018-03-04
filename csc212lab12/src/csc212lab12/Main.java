/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

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
        // create a Scanner for keyboard input
        Scanner kb = new Scanner(System.in);
        // user's command
        String command;
        // create and load the CDDB object from the input file
        CDDB cddb = new CDDB();
        cddb.load("cds.txt");
        // ask for and process user commands
        do {
            // prompt for command
            System.out.println("Enter search, or quit:");
            command = kb.nextLine();
            // process request
            switch(command) {
                case "search":
                    // get UPC from user
                    System.out.println("Enter the UPC:");
                    String upc = kb.nextLine();
                    String cdInfo = cddb.getCD(upc);
                    if (cdInfo != null) {
                        System.out.println(cdInfo);
                    } else {
                        System.out.println("CD not found");
                    }
                    break;
                case "quit":
                    System.out.println("Program ending.");
                    break;
                default:
                    System.out.println("I don't understand your command");
                    break;
            }
            
        } while (!command.equals("quit"));
        
    }
    
}
