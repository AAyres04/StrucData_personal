/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.opencsv.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author souriez
 */
public class LecturaCSV {
    
    private List<String[]> allData;
    
    public void leerCSV(String file){
        try { 
        // Create an object of file reader 
        // class with CSV file as a parameter. 
        FileReader filereader = new FileReader(file); 
  
        // create csvReader object and skip first Line 
        CSVReader csvReader = new CSVReaderBuilder(filereader) 
                                  .withSkipLines(1) 
                                  .build(); 
        allData = csvReader.readAll(); 
  
        // print Data 
        /*for (String[] row : allData) { 
            for (String cell : row) { 
                System.out.print(cell + "\t"); 
            } 
            System.out.println(); 
        } */
    } 
    catch (Exception e) { 
        e.printStackTrace(); 
    }
        
    }

    public List<String[]> getAllData() {
        return allData;
    }

    public void setAllData(List<String[]> allData) {
        this.allData = allData;
    }
    
    
    
}
