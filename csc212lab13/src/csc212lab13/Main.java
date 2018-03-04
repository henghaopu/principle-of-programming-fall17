/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab13;

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
    public static void main(String[] args) {

        // declare a keyboard Scanner
        Scanner kb = new Scanner(System.in);

        try {
            // prompt the user for values
            System.out.println("Enter an integer, a Boolean, and a String:");

            // read and print an integer token
            System.out.println("Integer: " + kb.nextInt());

            // add another println() statement to read/print a Boolean token
            System.out.println("Boolean: " + kb.nextBoolean());

            // add yet another println() statement to read/print the rest of the line
            System.out.println("String: " + kb.nextLine());
            
        } catch (Exception e) {
            System.out.println("Line Exception: " + e.toString());
        }
        
        System.out.println("Enter a file name:");
        String fileName = kb.nextLine();
        
        try {
            File f  = new File(fileName);
            Scanner fs = new Scanner(f);
            System.out.println("Scanner created.");
            System.out.println("Here are the file contents:");
            while(fs.hasNextLine()) {
            //while(true) {
                System.out.println(fs.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Exception: " + e.toString());
        }
        
    }
}
