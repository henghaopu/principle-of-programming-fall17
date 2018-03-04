/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

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
        System.out.println("Welcome to the CD Database");
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
            System.out.println("Enter search, add, name, list, or quit:");
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
                case "name":
                    System.out.println("Enter the full or partial name:");
                    String name = kb.nextLine();
                    cddb.printByName(name);
                    break;
                case "add":
                    System.out.println("Enter the UPC:");
                    String addedUPC = kb.nextLine();
                    System.out.println("Enter the price:");
                    Double addedPrice = Double.parseDouble(kb.nextLine());
                    System.out.println("Enter the Artist:");
                    String addedArtist = kb.nextLine();
                    System.out.println("Enter the Title:");
                    String addedTitle = kb.nextLine();
                    // call the addCD() method
                    cddb.addCD(new CompactDisc(addedUPC, addedPrice, addedArtist, addedTitle));
                    if (true) {
                        System.out.println("Add complete.");
                    } 
                    break;
                case "list":
                    cddb.printAll();
                    break;
                case "quit":
                    System.out.println("Program ending.");
                    break;
                default:
                    System.out.println("I don't understand your command. Please try again.");
                    break;
            }
            
        } while (!command.equals("quit"));
    }
    
}
