/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab08;

import java.text.DecimalFormat;

/**
 *
 * @author hpu
 */
public class Candy {
    
    private String name;
    private float price;
    private int ounces;
    // format decimal point of an input decimal number
    private DecimalFormat df = new DecimalFormat("0.00");
    
    public Candy(String n, float p, int o) {
        name = n;
        price = p;
        ounces = o;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + df.format(price) + "\nOunces: " + ounces;
    }
}
