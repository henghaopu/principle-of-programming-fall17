/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

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
        
        // file containing candy names 
        File file = new File("candy.txt");
        Scanner scanner = new Scanner(file);
        
        // array of candy names 
        String[] candyNames;
        
        // number of names which is put in the first line of the candy.txt file
        int numberOfNames = scanner.nextInt();
        
        // move to the next line (advance the input cursor past the first line because nextInt won't go to next line)
        scanner.nextLine();
        
        // set the array size
        candyNames = new String[numberOfNames];
        
        // read each line and copy to array element
        for (int i = 0; i < numberOfNames; i++) {
            // add the missing statement
            candyNames[i] = scanner.nextLine();
            System.out.println("Adding " + candyNames[i]);
        }
        
        // for loop from lab 8 ends above
        // new for lab 9
        // declare Scanner to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user how many shelves
        System.out.println("How many shelves in the vending machine?");
        int shelves = keyboard.nextInt();
        // consume CR/LF (Carriage Return/Line Feed)
        keyboard.nextLine();
        // ask user how many slots
        System.out.println("How many slots on each shelf?");
        int slotPerShelf = keyboard.nextInt();
        // consume CR/LF (Carriage Return/Line Feed)
        keyboard.nextLine();
        
        // create a VendingMaching object
        VendingMachine vendingMachine = new VendingMachine(shelves, slotPerShelf);
        vendingMachine.load(candyNames);
        vendingMachine.display();
        
        // ask user to select a shelf and slot 
        System.out.println("What shelf do you want?");
        int shelfSelection = keyboard.nextInt();
        // consume CR/LF (Carriage Return/Line Feed)
        keyboard.nextLine();
        System.out.println("What slot do you want?");
        int slotSlection = keyboard.nextInt();
        // consume CR/LF (Carriage Return/Line Feed)
        keyboard.nextLine();
        
        // call the purchase method on the VendingMachine object using the value we just collected as parameters
        vendingMachine.purchase(shelfSelection, slotSlection);
        
        // call the display method on the VendingMachine objcect to show the machine after a purchase
        vendingMachine.display();
    }
    
}
