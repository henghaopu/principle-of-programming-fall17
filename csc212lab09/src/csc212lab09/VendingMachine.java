/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

import java.util.Random;

/**
 *
 * @author hpu
 */
public class VendingMachine {
    
    private Candy[][] slots;
    // store the number of shelves in the machine
    private int shelves;
    // the number of slots on each shelf
    private int slotsPerShelf;
    
    public VendingMachine(int shelves, int slotsPerShelf) {
        this.shelves = shelves;
        this.slotsPerShelf = slotsPerShelf;
        slots = new Candy[this.shelves][this.slotsPerShelf];
    }
    
    public void load(String[] names) {
        // Random object for choosing name, price, and size
        Random random = new Random();
        
        // iterate over shelves
        for (int i = 0; i < shelves; i++) {
            // iterate over slots in a shelf
            for (int j = 0; j < slotsPerShelf; j++) {
                // generate random values and create a new Candy object
                String name = names[random.nextInt(names.length)];
                float price = random.nextFloat();
                int ounces = random.nextInt(4) + 1;
                slots[i][j] = new Candy(name, price, ounces);
            }
        }
    }
    
    // display the current contents of the machine 
    public void display() {
        // display the column labels
        System.out.println(" ");
        for (int j = 0; j < slots[0].length; j++) {
            System.out.printf("|%25d|", j);
        }
        System.out.println();
        // display the content of the machine 
        for (int i = 0; i < shelves; i++) {              
            // display the raw label
            System.out.printf("%2d", i);
            for (int j = 0; j < slotsPerShelf; j++) {          
                if (slots[i][j] == null) {
                    // slot is empty
                    System.out.printf("|%25s|", ""); // formatted printing: a string with a 25 character space 
                } else {
                    System.out.printf("|%25s|", slots[i][j].getName());
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void purchase(int row, int slot) {
        // attempt to purchase the item in a certain row with certain slot 
        if ((row >= 0 && row < slots.length) && (slot >= 0 && slot < slots[0].length)) {
            if (slots[row][slot] != null) {
                System.out.println("You purchased: " + slots[row][slot]);
                slots[row][slot] = null;
            } else {
                System.out.println("The candy is sold out at this slot."); 
            } 
        } else {
            System.out.println("Invalid selection");
        }
    }
}
