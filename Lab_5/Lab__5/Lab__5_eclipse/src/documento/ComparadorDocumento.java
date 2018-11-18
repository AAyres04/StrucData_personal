package documento;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/** Una clase para comparar tiempo de ejecución (Benchmarking) de las clases DocumentoBasico y DocumentoEficiente.
 * 
 * @author Pablo Valenzuela
 * 
 */

public class ComparadorDocumento {

	
	public static void main(String [] args) {

	    // Ejecuta cada test más de una vez para obtener números mayores y menos "ruido"
		// Puede probar varios números para evaluar.
	    int pruebas = 40;

	    // El texto para realizar pruebas
	    String archivoTexto = "./datos/warAndPeace.txt";
		
	    // La cantidad de caracteres a incrementar
	    // Puede probar varios números para evaluar.
	    
            
            int incremento = 20000;

            // El número de pasos a ejecutar.  
            // Puede probar varios números para evaluar.
            int numPasos = 20;
            
            // El número de caracteres para comenzar. 
            // Puede probar varios números para evaluar.
            int numComienzo = 50000;
    	
            long startTime;
            long endTime;

            String result;
                
            // Tarea: Complete el método tal que ejecuta 2 ciclos e imprima 
            // los tiempos resultante como se describe en la tarea (como vimos en clases).
            // Las instrucciones y pseudocódigo se encuentra a continuación.
		
            /*result = obtenerStringDesdeArchivo(archivoTexto, numComienzo);
            DocumentoBasico bas = new DocumentoBasico(result);
            
            DocumentoEficiente efi = new DocumentoEficiente(result);
            
            System.out.println(bas);
            System.out.println(efi);
            
            System.out.println(bas.obtFleschScore() + "\t" + efi.obtFleschScore());*/
                
            for(int i = 0; i<pruebas; i++){
                
                /*System.out.println("Prueba " + (i+1));
                System.out.println("N" + "\t" + "basico" + "\t" + "eficiente");*/
                
                for (int num2Check = numComienzo; num2Check < numPasos*incremento + numComienzo; 
                    num2Check += incremento){
                    // num2Check guarda el número de caracteres que usted debería leer
                    // desde el archivo para crear DocumentoBasico y DocumentoEficiente.
	    
                    /* Cada vez en este ciclo se debería:
                        * 1. Imprimir num2Check seguido por un tab (\t) (No una nueva linea)
                        * 
                        * 2. Lea los caracteres numToCheck desde el archivo en una cadena
                        *     Hint: use el método de ayuda que está inmediatamente abajo.
                        *     
                        * 3. Tome el tiempo de un ciclo que ejecute pruebas (pruebas es la variable arriba) que:
                        *        a. Crea un DocumentoBasico 
                        *        b. Llame fleshScore en este documento
                        *     
                        * 4. Imprima el tiempo que tomo completar el ciclo del paso 3
                        *	   (en la misma línea que la primera impresión) seguido de un tab (\ t)
                        *
                        * 5. Tome el tiempo de un ciclo que ejecute pruebas (pruebas es la variable arriba) que:
                        *        a. Crea un DocumentoEficiente
                        *        b. Llame fleshScore en este documento
                        *        
                        * 6. Imprima el tiempo que toma completar el ciclo en el paso 5 
                        *        
                        * Hint: Debe obtener 3 columnas
                        *
                        */  
                    
                    System.out.print(num2Check + "\t");
                        
                    result = obtenerStringDesdeArchivo(archivoTexto, num2Check);
                        
                    startTime = System.currentTimeMillis();

                    DocumentoBasico documentoB = new DocumentoBasico(result);
                    documentoB.obtFleschScore();

                    endTime = System.currentTimeMillis();
                        
                    System.out.print((endTime-startTime) + "\t");
                        
                    startTime = System.currentTimeMillis();
                        
                    DocumentoEficiente documentoE = new DocumentoEficiente(result);
                    documentoE.obtFleschScore();
                        
                    endTime = System.currentTimeMillis();
                        
                    System.out.println((endTime-startTime));

                }
            }
	
	}
	
	/** Obtenga un número específico de caracteres desde un archivo de texto
	 * 
	 * @param nombreArchivo El archivo a leer
	 * @param numCaracteres El número de caracteres a leer
	 * @return El string de texto desde un archivo con un número apropiado de caracteres
	 */
	public static String obtenerStringDesdeArchivo(String nombreArchivo, int numCaracteres) {
		
		StringBuffer sbuffer = new StringBuffer();
		try {
			FileInputStream archivoEntrada= new FileInputStream(nombreArchivo);
			InputStreamReader entradaStream = new InputStreamReader(archivoEntrada);
			BufferedReader buffReader = new BufferedReader(entradaStream);
			int val;
			int contador = 0;
			while ((val = buffReader.read()) != -1 && contador < numCaracteres) {
				sbuffer.append((char)val);
				contador++;
			}
			if (contador < numCaracteres) {
				System.out.println("Advertencia: Se alcanzó el final del archivo en " + contador + " caracteres.");
			}
			buffReader.close();
		}
		catch(Exception e)
		{
		  System.out.println(e);
		  System.exit(0);
		}
		
		
		return sbuffer.toString();
	}
	
}
