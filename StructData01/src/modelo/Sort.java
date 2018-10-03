/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author zeiruos
 */
public class Sort {
    
    
    public ArrayList<Aeropuerto> selectionSort(ArrayList<Aeropuerto> lista){
        
        int minimo;
        for(int i=0; i<lista.size()-1; i++){
            minimo = i;
            for(int j =  i + 1; j<lista.size(); j++){
                if(lista.get(j).compareTo(lista.get(i))<0){
                    minimo = j;
                }
                
            }
            
            Aeropuerto temp = lista.get(i);
            lista.set(i, lista.get(minimo));
            lista.set(minimo, temp);
            
            
        }
        
        
        //Collections.sort(lista);
        return lista;
    }
    
    
}
