/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.PaltaDATA;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo_problema.*;

/**
 *
 * @author souriez
 */
public class Menu {
    
    ArrayList<ModeloPalta> paltas;
    
    public Menu(){
        
        paltas = new PaltaDATA().setAllDataToModel();
        sortPaltas sort = new sortPaltas();
        
        this.paltas = sort.mergeSort(this.paltas);
    }
    
    
    public void menuPrincipal(){
        Scanner scan = new Scanner(System.in);
        int opcion;
        
        System.out.println("[1] Palta con el precio promedio mas bajo");
        System.out.println("[2] Obtener una lista ordenada de paltas (menor precio a mayor precio) por región");
        System.out.println("[3] Obtener una lista ordenada de X paltas (menor precio a mayor precio)");
        
        System.out.println("Ingrese un número");
        
        boolean catchin = false;
        try {
            opcion = scan.nextInt();
            if(opcion<0 && opcion>4){
                System.out.println("Opcion incorrecta");
                menuPrincipal();
            }else{
                switch(opcion){
                    case 1:
                        opcion1();
                        break;
                    case 2:
                        input2();
                        break;
                    case 3:
                        input3();
                        break;
                    case 4:
                        System.exit(0);
                        
                        
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Ingreso algo que no es un numero");
            catchin = true;
        }
        
        //opcion1();
        if(catchin){
            menuPrincipal();
        }
       //opcion3(50);
    }
    
    
    private void input2(){
        Scanner scan = new Scanner(System.in);
        
        String region;
        
        System.out.println("Ingrese la region a buscar");
        
        region = scan.nextLine();
        
        opcion2(region);
    }
    
    private void input3(){
        Scanner scan = new Scanner(System.in);
        
        int tamaño;
        
        System.out.println("Ingrese cantidad de paltas a rankear");
        
        try{
            tamaño = scan.nextInt();
            opcion3(tamaño);
        }catch(InputMismatchException e){
            System.out.println("Eso que ingreso no es un número");
        }
    }
    
    private void opcion1(){
        System.out.println("La palta con el precio mas bajo es...");
        System.out.println("Fecha: " + this.paltas.get(0).getDate() + "\t" + 
                "Región: " + this.paltas.get(0).getRegion() + "\t" + 
                "Tipo Palta: " + this.paltas.get(0).getType() + "\t" +
                "Precio: " + this.paltas.get(0).averagePrice);
        
        menuPrincipal();
        
    }
    
    private void opcion2(String region){
        System.out.println("Fecha" + "\t" + "Region" + "\t" + "Tipo Palta" + "\t" + "Precio");
        
        ArrayList<ModeloPalta> auxList = new ArrayList<>();
        
        for(int i = 0; i < this.paltas.size(); i++){
            if(this.paltas.get(i).getRegion().equals(region)){
                
                auxList.add(this.paltas.get(i));
            }
        }
        
        int mm;
        int yyyy;
        boolean mesOcupado = false;
        
        
        for(int j = 0; j < auxList.size(); j++){
            mm = auxList.get(j).getDate().getMonthValue();
            yyyy = auxList.get(j).getYear();
            for(int k = j; k>0; k--){
                if(auxList.get(k-1).getDate().getMonthValue() == mm && auxList.get(k-1).getYear() == yyyy){
                    mesOcupado = true;
                    break;
                }
            }
            
            if(!mesOcupado){
                System.out.println(auxList.get(j));
            }
            
            mesOcupado = false;
            
            
            
        }
    }
    
    private void opcion3(int numDatos){
        if(numDatos<this.paltas.size()){
            System.out.println("Fecha" + "\t" + "Region" + "\t" + "Tipo Palta" + "\t" + "Precio");
        
            for(int i = 0; i < numDatos; i++){
                System.out.println(this.paltas.get(i));
            }
        }else{
            System.out.println("El numero " + numDatos + " es mas grande que el tamaño de la lista de paltas (" + this.paltas.size() + ")");
        }
    }
    
}
