/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.util.Random;

/**
 *
 * @author hpu
 */
public class Passenger {
    
    private String name;
    private double fare;
    
    public Passenger(String name) {
        this.name = name;
        Random random = new Random();
        double min = 100;
        double max = 500;
        fare = min + (max - min) * random.nextDouble();
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Name:" + name + " fare:" + fare;
    }
}
