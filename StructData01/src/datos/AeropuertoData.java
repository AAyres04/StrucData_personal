/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.List;
import modelo.Aeropuerto;

/**
 *
 * @author zeiruos
 */
public class AeropuertoData {
    
    public ArrayList<Aeropuerto> construirAeropuertos(){
        
        ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
        
        LecturaCSV lectura = new LecturaCSV();
        lectura.leerCSV("./airports.csv");
        
        List<String[]> allData = lectura.getAllData();
        
        for(int i = 0; i<allData.size(); i++){
            
                int airportID = Integer.parseInt(allData.get(i)[0]);
                String nombre = allData.get(i)[1];
                String ciudad = allData.get(i)[2];
                String pais = allData.get(i)[3];
                String IATA = allData.get(i)[4];
                String ICAO = allData.get(i)[5];
                double latitud = Double.parseDouble(allData.get(i)[6]);
                double longitud =  Double.parseDouble(allData.get(i)[7]);
                double altitud = Double.parseDouble(allData.get(i)[8]);
                
                
                String zonaHoraria = allData.get(i)[9];
                
                
                String DST = allData.get(i)[10];
                String zonaHorariaTZ = allData.get(i)[11];
                String tipoAeropuerto = allData.get(i)[12];
                String source = allData.get(i)[13];
                aeropuertos.add(new Aeropuerto(airportID, nombre, ciudad, pais, IATA, ICAO, latitud, longitud, altitud, zonaHoraria, DST, zonaHorariaTZ, tipoAeropuerto, source));
                
            
        }
        
        return aeropuertos;
        
    }
}
