package documento;

/** 
 * Clase que representa un documento de texto
 * @author Pablo Valenzuela
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import documento.Documento;

public abstract class Documento {
	
	private String texto;
	
	/**
	 * crea un nuevo documento con el texto.
	 * Debido a que esta clase es abstracta, 
	 * debe ser utilizada sólo en subclases.
	 * @param texto
	 */
	
	protected Documento(String texto){
		this.texto = texto;
	}
	
	/**
	 * Devuelve los tokens que coinciden con el patrón de expresión regular
	 * de la cadena de texto del documento.
	 * @param patron Una cadena de expresiones regulares que especifica
	 * el patrón de tokens deseado
	 * @return Una lista de tokens del texto del documento que coinciden
	 * con el patrón de expresiones regulares
	 */
	
	protected List<String> obtenerTokens(String patron){
		ArrayList<String> tokens = new ArrayList<String>();
		/*
		 * Para más detalle investigue sobre Patter y Matcher
		 */
		Pattern tokDivisor = Pattern.compile(patron);
		Matcher match = tokDivisor.matcher(texto);
		while (match.find()) {
			tokens.add(match.group());
		}
		return tokens;
	}
	
	/** Esta es una función auxiliar que devuelve 
	 *  el número de sílabas en una palabra.
	 *  Debería ser utilizada en la clase DocumentoBasico.java.
	 * 
	 *  Por razones de eficiencia, no debe crear objetos Matcher
	 *  o Pattern dentro de este método. Debe usar un bucle para recorrer
	 *  los caracteres y escribir su propia lógica para contar las sílabas.
	 * 
	 * @param palabra  La palabra a la que se le contarán las sílabas 
	 * @return El número de sílabas en la palabra dada, de acuerdo con la regla:
	 *       Cada secuencia contigua de una o más vocales es una sílaba, 
	 *       con la siguiente excepción: una "e" solitaria al final de una palabra
	 *       no se considera una sílaba a menos que la palabra no tenga otras sílabas
	 *       Debe considerar la letra "y" como una vocal.
	 */
	
	protected int contarSilabas(String palabra){
		// TAREA: Implemente este método para que pueda ser llamado desde
		// el método obtenerNumSilabas en DocumentoBasico.java. 
		palabra = palabra.toLowerCase();

                int excepcion = 0;
                
                String[] silabas = palabra.split("[aeiouy]{1,}");
                
                if((palabra.length()-1)>=0&&palabra.endsWith("e")&&silabas.length!=1){
                    excepcion = 1;
                }
                
                return silabas.length-excepcion;
                
        }
	
	/** Un método para pruebas de caso
	 * 
	 * @param doc El objeto Documento a probar 
	 * @param silabas El número esperado de sílabas
	 * @param palabras El número esperado de palabras
	 * @param oraciones El número esperado de oraciones
	 * @return true if the test case passed.  False otherwise.
	 */
	
	public static boolean pruebasCaso(Documento doc, int silabas, int palabras, int oraciones){
		System.out.println("Probando el texto: ");
		System.out.print(doc.obtenerTexto() + "\n....");
		boolean aprobado = true;
		int silObtenidas = doc.obtenerNumSilabas();
		int palabrasObtenidas = doc.obtenerNumPalabras();
		int oracionesObtenidas = doc.obtenerNumOraciones();
		if (silObtenidas != silabas) {
			System.out.println("\nNúmero incorrecto de sílabas.  Se encontraron " + silObtenidas 
					+ ", esperadas " + silabas);
			aprobado = false;
		}
		if (palabrasObtenidas != palabras) {
			System.out.println("\nNúmero incorrecto de palabras.  Se encontraron " + palabrasObtenidas 
					+ ", esperadas " + palabras);
			aprobado = false;
		}
		if (oracionesObtenidas != oraciones) {
			System.out.println("\nNúmero incorrecto de oraciones.  Se encontraron " + oracionesObtenidas 
					+ ", esperadas " + oraciones);
			aprobado = false;
		}
		
		if (aprobado) {
			System.out.println("Aprobado.\n");
		}
		else {
			System.out.println("Reprobado.\n");
		}
		return aprobado;
	}
	
	
	/** Retorna el número de palabras en este documento */
	public abstract int obtenerNumPalabras();
	
	/** Retorna el número de oraciones en este documento */
	public abstract int obtenerNumOraciones();
	
	/** Retorna el número de sílabas en este documento */
	public abstract int obtenerNumSilabas();
	
	/** Retorna todo el texto de este documento */
	public String obtenerTexto(){
		return this.texto;
	}
	
	/** Retorna el indicador de legibilidad Flesch Score de este documento */
	public double obtFleschScore(){
	    // TAREA: Implementar este método
		if(obtenerNumOraciones()!=0&&obtenerNumPalabras()!=0){
                    return 206.835 - (1.015*(obtenerNumPalabras()/obtenerNumOraciones())) - (1.015*(obtenerNumSilabas()/obtenerNumOraciones()));
                }else{
                    return -1;
                }
	    
	}
	
        
        @Override
        public String toString(){
            return "Oraciones: " + obtenerNumOraciones() + "\n" +
                    "Palabras: " + obtenerNumPalabras() + "\n" +
                    "Silabas: " + obtenerNumSilabas();
        }

}
