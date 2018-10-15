package documento;

import java.util.List;

/** 
 * La clase representa un documento de texto
 * La clase recorre un documento para contar el nº de sílabas, palabras y
 * oraciones y luego guarda esos valores
 * 
 * @author Pablo Valenzuela
 */
public class DocumentoEficiente extends Documento {

	private int numPalabras;  // El nº de palabras en el documento
	private int numOraciones;  // El nº de oraciones en el documento
	private int numSilabas;  // El nº de sílabas en el documento
	
	public DocumentoEficiente(String texto){
		super(texto);
		procesarTexto();
	}
	
	
	/** 
	 * Toma un string qye contiene sólo caracteres alfabéticos,
	 * o sólo puntuación final de una oración
	 * Retorna truee si el string contiene sólo caracteres alfabéticos,
	 * y false si contiene puntuación final de oraciones.
	 * 
	 * @param token El String a evaluar
	 * @return true Si token es una palabra, false si es puntación 
	 */
	private boolean esPalabra(String token){
	    // Nota: Esta es una manera rápida de chequear si un String es una palabra
		// No es buena idea cambiar este método 
		return !(token.indexOf("!") >=0 || token.indexOf(".") >=0 || token.indexOf("?")>=0);
	}
	
	
    /** 
     * Pasa una vez por el texto y cuenta el nº de palabras, sílabas 
     * y oraciones y define las variables miembro (members variables) apropiadamente.
     * Palabras, oraciones y sílabas se definen abajo
     */
	private void procesarTexto(){
		// LLame a obtenerTokens para preservar cadenas separadas de palabras o puntuación.
		// Ignorar todo lo que no sea una palabra o puntución final.
		// ASEGÚRESE DE ENTENDER LA SIGUIENTE LÍNEA DE CÓDIGO ANTES DE SEGUIR
		List<String> tokens = obtenerTokens("[!?.]+|[a-zA-Z']+");
                //this.numOraciones = tokens.size();
                
                int auxNumPalabras = 0;
                int auxNumSilabas = 0;
                int auxNumOraciones = 0;
                
                
                for(int i=0; i<tokens.size(); i++){
                    
                    
                    
                    if(esPalabra(tokens.get(i))){
                        auxNumPalabras++;
                        auxNumSilabas += contarSilabas(tokens.get(i));
                    }else{
                        if(i+1<tokens.size()){
                            if(esPalabra(tokens.get(i+1))){
                                auxNumOraciones++;
                            }
                        }else{
                            auxNumOraciones++;
                        }
                    }
                }
                
                this.numPalabras = auxNumPalabras;
                this.numSilabas = auxNumSilabas;
                this.numOraciones = auxNumOraciones;
		
		// Tarea: Terminar este método. 
		// Recuerde el método contarSilabas de la Clase Documento.
		// El método esPalabra tambíen será de utilidad aquí.
	}

	
	/**
	 * Obtiene el nº de oraciones en el documento.
	 * Oraciones son definidas como strings de caracteres que terminan con
	 * un signo de puntuacion (. ! o ?). o el último conjunto de caracteres de un documento,
	 * incluso si se tiene un signo de puntuación final.
	 * 
	 * Este método no procesa todo el texto cada vez que es llamado.
	 * Retorna información que ya ha sido almacenada en el objeto DocumentoEficiente.
	 * (Quizás un modelo de memoria aclara este último punto)
	 *  
	 * @return El nº de oraciones en un documento.
	 */
	@Override
	public int obtenerNumOraciones() {
		//Tarea: Escriba el método aquí.  Hint: es muy simple
		return this.numOraciones;
	}

	
	/**
	 * Obtiene el nº de palabras en un documento
	 * Una "palabra" es definida como un string continuo de caracteres alfabéticos, 
	 * es decir, cualquier caracter a-z o A-Z. 
	 * Este método ignora completamente números cuando cuenta palabras, y asume que
	 * el documento no tiene string alguno que combine letras y números.
	 * 
	 * Este método no procesa el texto completo cada vez que es llamado.
	 * Retorna información que ya ha sido almacenada en el objeto DocumentoEficiente.
	 * 
	 * @return El número de palabras en el documento.
	 */
	@Override
	public int obtenerNumPalabras() {
		//Tarea: Escriba el método aquí.  Hint: es muy simple
	    return this.numPalabras;
	}


	/**
	 * Obteniene el nº total de sílabas en el documento (el texto guardado).
	 * Para calcular el número de sílabas en una palabra, use las siguientes reglas:
	 * 		Cada secuencia continua de una o más vocales es una sílabas,
	 * 		con la siguiente excepción: una "e" sola al final de una palabra 
	 * 		no es considera una sílaba, a menos que la palabra no tenga otras sílabas.
	 * 		Debe considerar y como una vocal.
	 * 
	 * Este método no procesa el texto completo cada vez que es llamado.
	 * Retorna información que ya ha sido almacenada en el objeto DocumentoEficiente.
	 * 
	 * @return El número de sílabas en un documento.
	 */
	@Override
	public int obtenerNumSilabas() {
        //Tarea: Escriba el método aquí.  Hint: es muy simple
        
        return this.numSilabas;
	}
	
	// Usar para testing
	// Puede escribir otras pruebas si lo desea
	public static void main(String[] args){
	    
		pruebasCaso(new DocumentoEficiente("Sentence. I am a sentence too you know, he said so! do not you think?"), 18, 15, 3);
		
		
	}
	

}
