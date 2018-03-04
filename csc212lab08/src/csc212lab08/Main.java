/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
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
        
        // declare an object for generating random values
        Random random = new Random();
        //System.out.println(candyNames[random.nextInt(numberOfNames)]);
        
        // declare an object to read keyboard input
        Scanner kb = new Scanner(System.in);
        
        // begin reading user commands
        System.out.println("Press ENTER for candy, or type 'quit'");
        String command = kb.nextLine();
        while(!command.equals("quit")) {
            
            // use a random index to get a candy name 
            // then generate a random price and number of ounces
            String randomCandyName = candyNames[random.nextInt(numberOfNames)];
            float randomPrice = random.nextFloat();
            int randomOunces = random.nextInt(4) + 1;
            Candy candy = new Candy( randomCandyName, randomPrice, randomOunces);
            System.out.println(candy);
        
            command = kb.nextLine();
        }
        
    }
    
}
