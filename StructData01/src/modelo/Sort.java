/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author zeiruos
 */
public class Sort {
    
    
    public ArrayList<Aeropuerto> selectionSort(ArrayList<Aeropuerto> lista){
        
        int minimo;
        for(int i = 0; i<lista.size(); i++){
            minimo = i;
            for(int j =  i; j<lista.size(); j++){
                if(lista.get(j).compareTo(lista.get(minimo)) < 0){
                    minimo = j;
                    
                }
                
            }
            
            
            Aeropuerto temp = lista.get(minimo);
            lista.set(minimo, lista.get(i));
            lista.set(i, temp);
            
            
        }
        
        return lista;
    }
    
    public ArrayList<Aeropuerto> insertionSort(ArrayList<Aeropuerto> lista){
        Aeropuerto temp;
        for(int i = 1; i<lista.size(); i++){
            for(int j =  i; j>0; j--){
                if(lista.get(j).compareTo(lista.get(j-1)) < 0){
                    temp = lista.get(j);
                    lista.set(j, lista.get(j-1));
                    lista.set(j-1, temp);
                    
                }
                
            }
            
        }
        
        return lista;
    }
    
    public ArrayList<Aeropuerto> mergeSort(ArrayList<Aeropuerto> lista){
        Collections.sort(lista);
        return lista;
    }
    
    
}
