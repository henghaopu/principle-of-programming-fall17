/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab02;

/**
 *
 * @author Heng-Hao Pu
 */
public class Cone {
    // Declare Variables
    int radius; // Radius of the base
    int height; // Height of the cone
    private double volume;
    
    public Cone(int rad, int hei) {
        // Constructor -- accepts two integer parameters
        radius = rad;
        height = hei;
        volume = getVolume();
    }
    
    public double getVolume() {
        return  (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
