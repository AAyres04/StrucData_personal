/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import modelo_problema.ModeloPalta;

/**
 *
 * @author souriez
 */
public class PaltaDATA {
    
    public ArrayList<ModeloPalta> setAllDataToModel(){
        List<String[]> allData;
        LecturaCSV lectura = new LecturaCSV();
        lectura.leerCSV("./PreciosPaltas.csv");
        allData = lectura.getAllData();
        
        int dd;
        int mm;
        int yyyy;
        double averagePrice;
        String type;
        int year;
        String region;
        
        ArrayList<ModeloPalta> paltas = new ArrayList<>();
        
        for(int i = 0; i < allData.size(); i++){
            
            String[] split = allData.get(i)[1].split("-");
            
            yyyy = Integer.parseInt(split[0]);
            mm = Integer.parseInt(split[1]);
            dd = Integer.parseInt(split[2]);
            
            averagePrice = Double.parseDouble(allData.get(i)[2]);
            type = allData.get(i)[11];
            year = Integer.parseInt(allData.get(i)[12]);
            region = allData.get(i)[13];
            
            ModeloPalta modeloAux = new ModeloPalta(LocalDate.of(yyyy, mm, dd),averagePrice,type,year,region);
            paltas.add(modeloAux);
            
        }
        
        return paltas;
        
    }
    
}
