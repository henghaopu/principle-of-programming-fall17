/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

/**
 *
 * @author hpu
 */
public class Player {
    
    private String firstName;
    private String lastName;
    
    public Player(String f, String l) {
        firstName = f;
        lastName = l;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String toString(){
        return lastName + ", " + firstName;
    }
}
