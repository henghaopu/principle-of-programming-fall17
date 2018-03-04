/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw04;

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

        boolean isGameOn = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Car Database\nEnter the size of the array:");
        int sizeOfTheArray = Integer.parseInt(scanner.nextLine());
        CarDatabase carDatabase = new CarDatabase(sizeOfTheArray);

        System.out.println("Enter the name of the input file:");
        String nameOfTheInputFile = scanner.nextLine();
        try {
            carDatabase.readFile(nameOfTheInputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            isGameOn = false;
        }

        System.out.println("Enter make, mpg, weight, all, or quit:");
        String keyword = scanner.nextLine();

        while (isGameOn) {
            switch (keyword) {
                case "make":
                    System.out.println("Enter the make:");
                    String makeString = scanner.nextLine();
                    carDatabase.displayMake(makeString);
                    break;
                case "mpg":
                    System.out.println("Enter the mpg range:");
                    String mpgRange = scanner.nextLine();
                    String[] rangeMinMax = mpgRange.split(" ");
                    carDatabase.mpgRange(Double.parseDouble(rangeMinMax[0]), Double.parseDouble(rangeMinMax[1]));
                    break;
                case "weight":
                    System.out.println("Enter the weight range:");
                    String weightRangeInputString = scanner.nextLine();
                    String[] weightMinMax = weightRangeInputString.split(" ");
                    try {
                        carDatabase.weightRange(Integer.parseInt(weightMinMax[0]), Integer.parseInt(weightMinMax[1]));
                        
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.toString());
                    }
                    break;
                case "all":
                    carDatabase.displayAll();
                    break;
                case "quit":
                    System.out.println("Closing Car Database");
                    isGameOn = false;
                    break;
                default:
                    System.out.println("Unknown command -- please try again.");
                    break;
            }
            
            // for "quit"
            if (isGameOn) {
                System.out.println("Enter make, mpg, weight, all, or quit:");
                keyword = scanner.nextLine();
            }
        }
    }
}
