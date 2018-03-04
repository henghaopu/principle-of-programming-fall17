/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab05;

import   java.io.File; 
import   java.util.Scanner;

/**
 *
 * @author hpu 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String line;
        int lineNum = 0;
        
        File input = new File("myfile.txt");
        Scanner scanner = new Scanner(input);
        
        while(scanner.hasNextLine()) {
            // read the next line 
            line = scanner.nextLine();
            // line number count increase by 1
            lineNum ++;
            // capitalize line
            String CapitalizedLine = line.toUpperCase();
            // print out the capitalized line 
            System.out.println(lineNum + " : " + CapitalizedLine);
        }
        
        System.out.println("End of file reached");
    }
    
}
