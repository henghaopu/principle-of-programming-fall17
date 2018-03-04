/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw03;

import java.util.*;

/**
 *
 * @author hpu
 */
public class Main {

    enum Rochambeau {
        PAPER(1),
        ROCK(2),
        SPOCK(3),
        LIZARD(4),
        SCISSORS(5);

        private int value;

        private Rochambeau(int value) {
            this.value = value;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Boolean isCommand1Right = false;
        Boolean isCommand2Right = false;

        Hashtable<Integer, Rochambeau> hashTable = new Hashtable<Integer, Rochambeau>();
        hashTable.put(1, Rochambeau.PAPER);
        hashTable.put(2, Rochambeau.ROCK);
        hashTable.put(3, Rochambeau.SPOCK);
        hashTable.put(4, Rochambeau.LIZARD);
        hashTable.put(5, Rochambeau.SCISSORS);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please enter your name:");
        String player1 = scanner.nextLine();
        System.out.println("Player 2, please enter your name:");
        String player2 = scanner.nextLine();
        
        System.out.println(player1 + ", please enter your command:");
        Integer command1 = Integer.parseInt(scanner.nextLine());
        Integer command2 = null;

        for (Map.Entry m : hashTable.entrySet()) {
            if (command1.equals(m.getKey())) {
                isCommand1Right = true;
            }
        }

        // 
        if (isCommand1Right) {
            System.out.println(player2 + ", please enter your command:");
            command2 = Integer.parseInt(scanner.nextLine());
            
            for (Map.Entry n : hashTable.entrySet()) {
                if (command2.equals(n.getKey())) {
                    isCommand2Right = true;
                } 
            }

        } else {
            System.out.println("I'm sorry, this is not a valid command.");
        }
        
        // 
        if (isCommand1Right && !isCommand2Right) {
            System.out.println("I'm sorry, this is not a valid command.");
        }

        // 
        if (isCommand1Right && isCommand2Right) {
            switch (hashTable.get(command1)) {
                case PAPER:
                    switch (hashTable.get(command2)) {
                        case PAPER:
                            System.out.println("Draw!");
                            break;
                        case ROCK:
                            System.out.println(player1 + " wins! " + "Paper covers Rock.");
                            break;
                        case SPOCK:
                            System.out.println(player1 + " wins! " + "Paper disproves Spock.");
                            break;
                        case LIZARD:
                            System.out.println(player2 + " wins! " + "Lizard eats Paper.");
                            break;
                        case SCISSORS:
                            System.out.println(player2 + " wins! " + "Scissors cuts Paper.");
                            break;
                    }
                    break;
                case ROCK:
                    switch (hashTable.get(command2)) {
                        case PAPER:
                            System.out.println(player2 + " wins! " + "Paper covers Rock.");
                            break;
                        case ROCK:
                            System.out.println("Draw!");
                            break;
                        case SPOCK:
                            System.out.println(player2 + " wins! " + "Spock vaporizes Rock.");
                            break;
                        case LIZARD:
                            System.out.println(player1 + " wins! " + "Rock crushes Lizard.");
                            break;
                        case SCISSORS:
                            System.out.println(player1 + " wins! " + "Rock crushes Scissors.");
                            break;
                    }
                    break;
                case SPOCK:
                    switch (hashTable.get(command2)) {
                        case PAPER:
                            System.out.println(player2 + " wins! " + "Paper disproves Spock.");
                            break;
                        case ROCK:
                            System.out.println(player1 + " wins! " + "Spock vaporizes Rock.");
                            break;
                        case SPOCK:
                            System.out.println("Draw!");
                            break;
                        case LIZARD:
                            System.out.println(player2 + " wins! " + "Lizard poisons Spock.");
                            break;
                        case SCISSORS:
                            System.out.println(player1 + " wins! " + "Spock smashes Scissors.");
                            break;
                    }
                    break;
                case LIZARD:
                    switch (hashTable.get(command2)) {
                        case PAPER:
                            System.out.println(player1 + " wins! " + "Lizard eats Paper.");
                            break;
                        case ROCK:
                            System.out.println(player2 + " wins! " + "Rock crushes Lizard.");
                            break;
                        case SPOCK:
                            System.out.println(player1 + " wins! " + "Lizard poisons Spock.");
                            break;
                        case LIZARD:
                            System.out.println("Draw!");
                            break;
                        case SCISSORS:
                            System.out.println(player2 + " wins! " + "Scissors decapitates Lizard.");
                            break;
                    }
                    break;
                case SCISSORS:
                    switch (hashTable.get(command2)) {
                        case PAPER:
                            System.out.println(player1 + " wins! " + "Scissors cuts Paper.");
                            break;
                        case ROCK:
                            System.out.println(player2 + " wins! " + "Rock crushes Scissors.");
                            break;
                        case SPOCK:
                            System.out.println(player2 + " wins! " + "Spock smashes Scissors.");
                            break;
                        case LIZARD:
                            System.out.println(player1 + " wins! " + "Scissors decapitates Lizard.");
                            break;
                        case SCISSORS:
                            System.out.println("Draw!");
                            break;
                    }
                    break;
            }
        } 

        System.out.println("Thank you for playing.");
    }
}
