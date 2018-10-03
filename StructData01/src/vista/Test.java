/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.AeropuertoData;
import java.util.ArrayList;
import modelo.Aeropuerto;
import modelo.Search;
import modelo.Sort;

/**
 *
 * @author souriez
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AeropuertoData aero = new AeropuertoData();
        ArrayList<Aeropuerto> lista = aero.construirAeropuertos();
        
        /*for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }*/
        
        Sort sort = new Sort();
        ArrayList<Aeropuerto> listaOrdenada;
                
        /*listaOrdenada = sort.selectionSort(lista);
        
        
        for(int i = 0; i<listaOrdenada.size(); i++){
            System.out.println(listaOrdenada.get(i));
        }
        
        
        listaOrdenada = sort.insertionSort(lista);
        
        for(int i = 0; i<listaOrdenada.size(); i++){
            System.out.println(listaOrdenada.get(i));
        }*/
        
        listaOrdenada = sort.mergeSort(lista);
        
        Aeropuerto air = new Aeropuerto();
        air.setNombre("Hopetoun Airport");
        
        Search search = new Search();
        if(search.binarySearch(listaOrdenada, air)) {System.out.println("Aeropuerto " + air.getNombre() + " encontrado");}
        else System.out.println("no");
        
        /*if(search.linearSearch(lista, air.getNombre())) {System.out.println("Aeropuerto " + air.getNombre() + " encontrado");}
        else System.out.println("no");*/
        
    }
    
}
