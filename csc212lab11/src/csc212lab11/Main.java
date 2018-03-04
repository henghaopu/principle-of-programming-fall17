/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

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
        // variable for user's command
        String command;
        
        // create and load the players object from the input file
        Players p = new Players();
        p.load("players.txt");
        
        // ask for and process user commands
        do {
            // prompt for command 
            System.out.println("Enter id, name, or quit");
            command = kb.nextLine();
            
            // process command 
            switch(command) {
                case "id":
                    // get id from user
                    System.out.println("Enter the ID:");
                    String id = kb.nextLine();
                    String playerName = p.getPlayerByID(id);
                    if (playerName != null) {
                        System.out.println("Player: " + playerName);
                    } else {
                        System.out.println("Player id not found");
                    }
                    break;
                case "name":
                    // look up ids by name
                    System.out.println("Enter player's last name:");
                    String lastName = kb.nextLine();
                    p.printIdsByName(lastName);
                    break;
                case "quit":
                    System.out.println("Programm ending.");
                   break;
                default:
                    System.out.println("I don't understand your command");
                    break;
            }       
        } while (!command.equals("quit"));
    }
}
