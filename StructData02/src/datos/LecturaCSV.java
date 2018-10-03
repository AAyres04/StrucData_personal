/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.opencsv.*;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author souriez
 */
public class LecturaCSV {
    
    private List<String[]> allData;
    
    public void leerCSV(String file, char separator){
        try { 
        
        FileReader filereader = new FileReader(file); 
        
        CSVParser parser = new CSVParserBuilder().withSeparator(separator).build();
  
        
        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).withCSVParser(parser).build();
        
        allData = csvReader.readAll();
  
        
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
