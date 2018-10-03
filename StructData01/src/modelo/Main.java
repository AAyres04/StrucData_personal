/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.AeropuertoData;
import datos.LecturaCSV;
import java.util.ArrayList;

/**
 *
 * @author souriez
 */
public class Main {

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
        ArrayList<Aeropuerto> listaOrdenada = sort.selectionSort(lista);
        for(int i = 0; i<listaOrdenada.size(); i++){
            System.out.println(listaOrdenada.get(i));
        }
            
    }
    
}
