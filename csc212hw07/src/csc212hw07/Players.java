/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hpu
 */
public class Players {
    
    private ArrayList<Player> list; // player
    private ArrayList<String> ids;  // player id
    
    public Players() {
        list = new ArrayList<Player>();
        ids = new ArrayList<String>();
    }
    
    public void load(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        
        int i = 0;
        while(sc.hasNextLine()) {
            // create a Scanner from the input line
            Scanner lineScanner = new Scanner(sc.nextLine());
            // change the delimiter to a comma
            lineScanner.useDelimiter(",");
            // add this id
            ids.add(i, lineScanner.next());
            // Create a player from the remaining tokens
            Player p = new Player(lineScanner.next(), lineScanner.next());
            list.add(i, p);
            i++;
        }
    }
    
    public String getPlayerByID(String id) {
        int index = ids.indexOf(id);
        if (index > -1) {
            // player was found 
            return list.get(index).toString();
        } else {
            // player was not found
            return null;
        }
    }
    
    public void printIdsByName(String l) {
        // print all ids whose name matches parameter
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLastName().equals(l)) {
                // name match on this index
                System.out.println(ids.get(i) + ": " + list.get(i));
            } 
        }
    } 
}
