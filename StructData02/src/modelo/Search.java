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
    
    public boolean binarySearch(ArrayList<Furgon> furgonesSorteados, String key){
      
        Furgon furgonKey = new Furgon();
        furgonKey.setPatente(key);
        
        int start = 0;
        int end = furgonesSorteados.size()-1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(furgonKey.getPatente().equals(furgonesSorteados.get(mid).getPatente())){
                return true;
            }else if(furgonKey.compareTo(furgonesSorteados.get(mid)) < 0){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
