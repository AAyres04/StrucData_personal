/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.PaltaDATA;
import java.util.ArrayList;
import modelo_problema.ModeloPalta;

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
        /*PaltaDATA paltas = new PaltaDATA();
        
        ArrayList<ModeloPalta> palto = paltas.setAllDataToModel();
        
        for(int i = 0; i< palto.size(); i++){
            System.out.println(palto.get(i).getDate());
        }*/
        
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
    
}
