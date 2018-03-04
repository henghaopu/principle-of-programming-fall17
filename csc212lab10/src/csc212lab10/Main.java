/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

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
        StringStack ss = new StringStack(4);
        String command;     // hold the user's current command
        String word = "";   // hold the word typed by the user 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter push, pop, peek, combine, or quit:");
        command = sc.next();
        while (!command.equals("quit")) {
            switch (command) {
                case "push":
                    word = sc.next();
                    ss.push(word);
                    break;
                case "peek":
                    word = ss.peek();
                    if (word != null) {
                        System.out.println("Top: " + word);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case "pop":
                    word = ss.pop();
                    if (word != null) {
                        System.out.println(word);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case "combine":
                    // construct a new value for word
                    String firstWord = ss.pop();
                    if (firstWord == null) {
                        System.out.println("There's no value to be combined because the stack is empty.");
                        break;
                    } else {
                        String secondWord = ss.pop();
                        if (secondWord == null) {
                            word = firstWord;
                        } else {
                            word = firstWord + " " + secondWord;
                        }
                        ss.push(word);
                        break;
                    }
            }
            // get next command
            System.out.println("Enter push, pop, peek, combine, or quit:");
            command = sc.next();
        }
        System.out.println("Programming Ending");
    }

}
