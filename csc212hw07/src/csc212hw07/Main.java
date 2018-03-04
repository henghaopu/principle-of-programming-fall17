/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

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
        Players players = new Players();
        Awards awards = new Awards();

        players.load("players.txt");
        awards.load("awards.txt");

        System.out.println("Welcome to the Baseball Database");
        Scanner kb = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter id, name, awards, or quit:");
            command = kb.nextLine();
            
            switch (command) {
                case "id":
                    System.out.println("Enter the id:");
                    String id = kb.nextLine();
                    String playerName = players.getPlayerByID(id);
                    if (playerName != null) {
                        System.out.println("Player: " + playerName);
                    } else {
                        System.out.println("Player id not found");
                    }
                    break;
                case "name":
                    System.out.println("Enter player's last name:");
                    String name = kb.nextLine();
                    players.printIdsByName(name);
                    break;
                case "awards":
                    System.out.println("Enter the id:");
                    String identification = kb.nextLine();
                    awards.printAwards(identification);
                    break;
                case "quit":
                    System.out.println("Closing Baseball Database");
                    break;
                default:
                    System.out.println("I don't understand your command.");
                    break;
            }
        } while (!command.equals("quit"));

    }

}
