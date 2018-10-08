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
            palabra = palabra.toLowerCase();
            int numSilabas = 0;
            char[] caracteres = palabra.toCharArray();
            
            for(int i=0; i<caracteres.length; i++){
                
                if(i==caracteres.length-1){
                    numSilabas++;
                }
                
                if(isVocal(caracteres, i)){
                    if(i+1<caracteres.length){
                        if(isDiptongo(caracteres, i)){
                            
                        }else if(isHiato(caracteres, i)){
                            numSilabas++;
                        }else if(!isVocal(caracteres,i+1)){
                            if(i+2<caracteres.length){
                                if(isVocal(caracteres,i+2)){
                                    numSilabas++;
                                    
                                }else{
                                    if(i+3<caracteres.length){
                                        if(isVocal(caracteres,i+3)){
                                            numSilabas++;
                                            
                                        }else{
                                            if(i+4<caracteres.length){
                                                if(isVocal(caracteres,i+4)){
                                                    numSilabas++;
                                                    
                                                
                                                }else{
                                                    if(i+5<caracteres.length){
                                                        if(isVocal(caracteres,i+5)){
                                                            numSilabas++;
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        
                        }else if(i+2<caracteres.length){
                            if(isDiptongoConH(caracteres, i)){
                            
                            }else if(isHiatoConH(caracteres, i)){
                                numSilabas++;
                                System.out.println("");
                            }
                            
                        }
                            
                    }    
                }
                
            }
            
            return numSilabas;
        }
        
        private boolean isDiptongo(char[] caracteres, int indice){
           
                return (((caracteres[indice]=='i'||caracteres[indice]=='u')&&(caracteres[indice+1]=='i'||caracteres[indice+1]=='u'))
                        ||((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+1]=='i'||caracteres[indice+1]=='u'))
                        ||((caracteres[indice]=='i'||caracteres[indice]=='u')&&(caracteres[indice+1]=='a'||caracteres[indice+1]=='á'||caracteres[indice+1]=='e'||caracteres[indice+1]=='é'||caracteres[indice+1]=='o'||caracteres[indice+1]=='ó')));
                    
                
        }
        
        private boolean isDiptongoConH(char[] caracteres, int indice){
            return caracteres[indice+1]=='h'&&(((caracteres[indice]=='i'||caracteres[indice]=='u')&&(caracteres[indice+2]=='i'||caracteres[indice+2]=='u'))
                        ||((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+2]=='i'||caracteres[indice+2]=='u'))
                        ||((caracteres[indice]=='i'||caracteres[indice]=='u')&&(caracteres[indice+2]=='a'||caracteres[indice+2]=='á'||caracteres[indice+2]=='e'||caracteres[indice+2]=='é'||caracteres[indice+2]=='o'||caracteres[indice+2]=='ó')));
        }
        
        private boolean isHiato(char[] caracteres, int indice){
                return (((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+1]=='a'||caracteres[indice+1]=='á'||caracteres[indice+1]=='e'||caracteres[indice+1]=='é'||caracteres[indice+1]=='o'||caracteres[indice+1]=='ó'))
                        ||((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+1]=='í'||caracteres[indice+1]=='ú'))
                        ||((caracteres[indice]=='í'||caracteres[indice]=='ú')&&(caracteres[indice+1]=='a'||caracteres[indice+1]=='á'||caracteres[indice+1]=='e'||caracteres[indice+1]=='é'||caracteres[indice+1]=='o'||caracteres[indice+1]=='ó')));
                   
                }
        private boolean isHiatoConH(char[] caracteres, int indice){
            return caracteres[indice+1]=='h'&&(((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+2]=='a'||caracteres[indice+2]=='á'||caracteres[indice+2]=='e'||caracteres[indice+2]=='é'||caracteres[indice+2]=='o'||caracteres[indice+2]=='ó'))
                        ||((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='o'||caracteres[indice]=='ó')&&(caracteres[indice+2]=='í'||caracteres[indice+2]=='ú'))
                        ||((caracteres[indice]=='í'||caracteres[indice]=='ú')&&(caracteres[indice+2]=='a'||caracteres[indice+2]=='á'||caracteres[indice+2]=='e'||caracteres[indice+2]=='é'||caracteres[indice+2]=='o'||caracteres[indice+2]=='ó')));
        }
        
        private boolean isVocal(char[] caracteres, int indice){
            return ((caracteres[indice]=='a'||caracteres[indice]=='á'||caracteres[indice]=='e'||caracteres[indice]=='é'||caracteres[indice]=='i'||caracteres[indice]=='í'||caracteres[indice]=='o'||caracteres[indice]=='ó'||caracteres[indice]=='u'||caracteres[indice]=='u'||caracteres[indice]=='ú'));
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
            
	    return 0.0;
	}
	

}