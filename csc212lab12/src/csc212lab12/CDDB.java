/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author hpu
 */
public class CDDB {
    
    private HashMap<String, CompactDisc> hashMapDatabase;
    
    // what is the difference between <> and non <> when newing one
    public CDDB() {
        hashMapDatabase = new HashMap<String, CompactDisc>();
        //hashMapDatabase = new HashMap();
    }
    
    public void load(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        
        while(fileScanner.hasNextLine()) {
            // create a scanner from the input file
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            // change the delimiter to a comma
            lineScanner.useDelimiter(",");
            // create a CompactDisc object from the tokens
            String upc = lineScanner.next();
            double price = lineScanner.nextDouble();
            String artist = lineScanner.next();
            String title = lineScanner.next();
            CompactDisc compactDisc = new CompactDisc(upc, price, artist, title);
            // make the CompactDisc object part of the hashmap
            hashMapDatabase.put(upc, compactDisc);
        }
    }
    
    public String getCD(String key) {
        if (hashMapDatabase.containsKey(key)) {
            // key was found -- get the value
            return hashMapDatabase.get(key).toString();            
        } else {
            // key was not found
            return null;
        }
    }
}
