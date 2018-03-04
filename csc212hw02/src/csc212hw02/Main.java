/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw02;
import java.util.Scanner;

/**
 *
 * @author Heng-Hao Pu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the observation date:");
        Scanner input =  new Scanner(System.in);
        String date = input.nextLine();
        System.out.println("Enter the wind speed in MPH:");
        int windSpeed = input.nextInt();
        System.out.println("Enter the temperature in degrees F:");
        int temperature = input.nextInt();
        
        Observation observation = new Observation(date, windSpeed, temperature);
        System.out.println("Observation date: " + observation.getDate());
        System.out.println("Wind chill: " + observation.getWindChill());
        
    }
    
}
