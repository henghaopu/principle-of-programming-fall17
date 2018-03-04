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
public class Awards {
    
    ArrayList<String> ids;
    ArrayList<Award> awards;
    
    public Awards() {
        ids = new ArrayList<String>();
        awards = new ArrayList<Award>();
    }
    
    public void load(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        
        int index = 0;
        while(sc.hasNextLine()) {
            Scanner lineScanner = new Scanner(sc.nextLine());
            lineScanner.useDelimiter(",");
            // e.g., bondto01,Triple Crown,1877,NL
            ids.add(index, lineScanner.next());
            String title = lineScanner.next();
            int year = Integer.parseInt(lineScanner.next());
            String league = lineScanner.next();
            Award award = new Award(title, year, league);
            awards.add(index, award);
            index++;
        }
    }
    
    public void printAwards(String id) {
        
        int awardCount = 0;
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i).equals(id)) {
                System.out.println(awards.get(i));
                awardCount++;
            } 
        }
        
        if (awardCount == 0) {
             System.out.println("No awards for this player.");
        }
    }
}
