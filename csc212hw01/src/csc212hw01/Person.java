/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw01;

/**
 *
 * @author Heng-Hao Pu
 */
public class Person {
    public String lastName;
    public String firstName;
    public int age;
    
    public String getFullName() {
        return firstName + " " + lastName; 
    }
}
