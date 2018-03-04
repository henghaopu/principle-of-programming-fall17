/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw04;

/**
 *
 * @author hpu
 */
public class Car {
    String model;
    String make;
    double mpg;
    int weight;
    int year;
    
    public Car (String model, String make, double mpg, int weight, int year) {
        this.model = model;
        this.make = make;
        this.mpg = mpg;
        this.weight = weight;
        this.year = year;
    }
    
    public String toString() {
        return "Model:" + model + " Make:" + make + " mpg:" + mpg + " weight:" + weight + " year:" + year;
    }
}
