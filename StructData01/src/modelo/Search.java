/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author zeiruos
 */
public class Search {
    
    public boolean linearSearch(ArrayList<Aeropuerto> aeropuertos, String aBuscar){
        for(int i = 0; i< aeropuertos.size(); i++){
            if(aeropuertos.get(i).getNombre().equals(aBuscar)){
                return true;
            }
        }
        return false;
    }
    
    public boolean binarySearch(ArrayList<Aeropuerto> aeropuertosSorteados, Aeropuerto key){
        int start = 0;
        int end = aeropuertosSorteados.size()-1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(key.getNombre().equals(aeropuertosSorteados.get(mid).getNombre())){
                return true;
            }else if(key.compareTo(aeropuertosSorteados.get(mid)) < 0){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
