/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.FurgonData;
import java.util.ArrayList;
import modelo.Furgon;
import modelo.Search;
import modelo.Sort;

/**
 *
 * @author zeiruos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FurgonData lecturaFurgones = new FurgonData();
        
        ArrayList<Furgon> furgones = lecturaFurgones.construirFurgones();
        
        /*furgones.forEach((furgon) -> {
            System.out.println(furgon);
        });*/ 
        
        Sort sort = new Sort();
        
        
        Search search = new Search();
        
        ArrayList<Furgon> furgonesOrdenados = sort.mergeSort(furgones);
        
        if(search.binarySearch(furgonesOrdenados, "OBI1165")) System.out.println("Se encontro la patente");;
        
    }
    
}
