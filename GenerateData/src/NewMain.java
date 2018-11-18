/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generator g = new Generator();
        String salida = "N° PATENTE;N° CHASIS;EJES;MARCA;KM ACTUAL;KM ULTIMA "
                + "MANTENCION;FECHA COMPRA;FECHA ULTIMA MANTENCION;FECHA ULTIMO"
                + " PROBLEMA;N° PROBLEMAS\n";
        String[] datos = new String[100];
        for (int j = 0; j < datos.length; j++) {
            datos[j]="";
            for (int i = 0; i < 1000; i++) {
                datos[j] += g.generate() + "\n";
                //System.out.println("--");
                //datos += g.generate() + "\n";
            }
        }
        FileHandler f = new FileHandler("");
        for (int i = 0; i < datos.length; i++) {
            salida+=datos[i];
        }
        f.escritura(salida, "datos 100k.csv");
        //System.out.println(datos);
    }

}
