package datos;

import java.util.ArrayList;
import java.util.List;
import modelo.Furgon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeiruos
 */
public class FurgonData {
    
    
    public ArrayList<Furgon> construirFurgones(){
        
        ArrayList<Furgon> furgones = new ArrayList<>();
        
        LecturaCSV lectura = new LecturaCSV();
        lectura.leerCSV("./datos.csv", ';');
        
        List<String[]> allData = lectura.getAllData();
        
        for(int i = 0; i<7000; i++){
            String patente = allData.get(i)[0];
            int chasis = checkNullInt(allData.get(i)[1]);
            int ejes = checkNullInt(allData.get(i)[2]);
            String marca = allData.get(i)[3];
            int actualKM = checkNullInt(allData.get(i)[4]);
            int matencionKM = checkNullInt(allData.get(i)[5]);
            String compra_date = allData.get(i)[6];
            String mantencion_date = allData.get(i)[7];
            String problema_date = allData.get(i)[8];
            int nProblemas = checkNullInt(allData.get(i)[9]);
            furgones.add(new Furgon(patente, chasis, ejes, marca, actualKM, matencionKM, compra_date, mantencion_date, problema_date, nProblemas));
            if(i == 60000) System.out.println("estoy en " + i);
        }
        return furgones;
    }
    
    
    private int checkNullInt(String dato){
        if(dato.equals("NULL")){
            return -1;
        } else {
            return Integer.parseInt(dato);
        }
    }
}
