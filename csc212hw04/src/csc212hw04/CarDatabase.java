/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hpu
 */
public class CarDatabase {
    
    private Car[] carArray;
    
    public CarDatabase (int sizeOfTheCarArray) {
        carArray = new Car[sizeOfTheCarArray];
    }
    
    public boolean isFull() {
        //returns a boolean value indicating if array is full 
        if (carArray.length <= 398) {
            return true;
        } else {
            return false;
        }
    }
    
    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        for (int i = 0; i < Math.min(carArray.length, 398) && scanner.hasNextLine(); i++) {
            String[] carProperties = scanner.nextLine().split(",");
            String carModel = carProperties[0];
            String carMake = carProperties[1];
            double carMPG = Double.parseDouble(carProperties[2]);
            int carWeight = Integer.parseInt(carProperties[3]);
            int carYear = Integer.parseInt(carProperties[4]);       
            carArray[i] = new Car(carModel, carMake, carMPG, carWeight, carYear);
        }
    }
    
    public void displayMake(String make) {
        for (int i = 0; i < Math.min(carArray.length, 398); i++) {
            if (carArray[i].make.equals(make)) {
                System.out.println(carArray[i].toString());;
            }
        }
    }
    
    public void mpgRange(double min, double max) {
        for (int i = 0; i < Math.min(carArray.length, 398); i++) {
            if (carArray[i].mpg > min && carArray[i].mpg < max) {
                System.out.println(carArray[i].toString());
            }
        }
    }
    
    public void weightRange(double min, double max) {
        for (int i = 0; i < Math.min(carArray.length, 398); i++) {
            if ((carArray[i].weight > min && carArray[i].weight < max) || (carArray[i].weight == max) || (carArray[i].weight == min)) {
                System.out.println(carArray[i].toString());
            } 
        }
    }
    
    public void displayAll() {
        for (int i = 0; i < Math.min(carArray.length, 398); i++) {
            System.out.println(carArray[i].toString());
        }
    }
}
