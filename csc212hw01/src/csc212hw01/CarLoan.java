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
public class CarLoan {
    public String bankName;
    public int accountNumber;
    public Person signer;
    public Person coSigner;
    
    public String getInfo() {
        return bankName + " " + accountNumber; 
    }
}
