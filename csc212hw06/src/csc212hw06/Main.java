/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

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

        System.out.println("Welcome to Oswego Airlines");
        System.out.println("Enter a flight number:");
        Scanner scanner = new Scanner(System.in);
        String flightNumber = scanner.nextLine();
        System.out.println("Enter the number of rows:");

        int rowNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of seats per row:");
        int seatNumber = Integer.parseInt(scanner.nextLine());
        Plane plane = new Plane(flightNumber, rowNumber, seatNumber);

        System.out.println("Enter add, remove, seats, list, or quit:");
        String command = scanner.nextLine();
        while (!command.trim().equals("quit")) {
            switch (command.trim()) {
                case "add":
                    System.out.println("Enter passenger name, row, and seat:");
                    String[] passengerInfo = scanner.nextLine().split(" ");
                    String name = passengerInfo[0];
                    int row = Integer.parseInt(passengerInfo[1]);
                    int seat = Integer.parseInt(passengerInfo[2]);
                    if (row < rowNumber && seat < seatNumber) {
                        if (plane.addPassenger(name, row, seat)) {
                            System.out.println("Passenger " + name + " was added.");
                        } else {
                            System.out.println("Invalid seat -- please try again.");
                        }
                    } else {
                        System.out.println("Invalid seat -- please try again.");
                    }
                    break;
                case "remove":
                    System.out.println("Enter row and seat:");
                    String[] removeInfo = scanner.nextLine().split(" ");
                    int removeRow = Integer.parseInt(removeInfo[0]);
                    int removeSeat = Integer.parseInt(removeInfo[1]);
                    if (removeRow < rowNumber && removeSeat < seatNumber) {
                        if (plane.removePassenger(removeRow, removeSeat)) {
                            System.out.println("Passenger was removed.");
                        } else {
                            System.out.println("Invalid seat -- please try again.");
                        }
                    } else {
                        System.out.println("Invalid seat -- please try again.");
                    }
                    break;
                case "seats":
                    plane.showSeats();
                    break;
                case "list":
                    plane.passengerList();
                    break;
                default:
                    System.out.println("Unknown command -- please try again.");
                    break;
            }
            System.out.println("Enter add, remove, seats, list, or quit:");
            command = scanner.nextLine();
        }
        System.out.println("Closing Oswego Airlines");
    }
}
