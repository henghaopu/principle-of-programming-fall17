/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab03;
import java.util.Scanner;
/**
 *
 * @author regan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String userString, line; // user's input string, current input line
        int start, end; // start and end character position in the user's string
        
        Scanner kb = new Scanner(System.in); // keyboard
        System.out.println("Enter a character string:");
        userString = kb.nextLine(); // read in the string
        System.out.println("you typed: " + userString);
        System.out.println("String length: " + userString.length());
        System.out.println("Lower case: " + userString.toLowerCase());
        System.out.println("Upper case: " + userString.toUpperCase());
        System.out.println("Enter a start position:" );
        line = kb.nextLine();
        start = Integer.parseInt(line);
        System.out.println("Enter a end position:");
        line = kb.nextLine();
        end = Integer.parseInt(line);
        System.out.println("The character at position " + start + " is " + userString.charAt(start));
        System.out.println("The substring between positions " + start + " and " + end + " is " + userString.substring(start, end));
    }
    
}
