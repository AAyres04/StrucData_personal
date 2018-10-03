package documento;
import documento.DocumentoBasico;

/** 
 * Una implementación simple de la clase abstracta Documento. 
 * @author Pablo Valenzuela
 */

public class DocumentoBasico extends Documento{
	
	/**
	 * Crea un nuevo objeto DocumentoBasico 
	 * @param El texto completo de un documento.
	 */
	public DocumentoBasico(String texto){
		super(texto);
		
	}
	
	/**
	 * Obtener el número de palabras en el documento.
	 * Una "palabra" es definida como un string de caracteres alfabéticos,
	 * es decir, cualquier caracter (mayúscula o minúscula) a-z o A-Z. 
	 * Este método debe ignorar completamente el conteo de palabras
	 * y asume que el documento no tiene strings que combinan numeros y letras
	 * (Revisar los ejemplos en el método main más abajo para ayuda).
	 * 
	 * Este método debe procesar el string de texto completo cada vez que es llamado.
	 * 
	 * @return El número de palabras en un documento.
	 */
	@Override
	public int obtenerNumPalabras(){
		//TAREA: Implementar este método de acuerdo al comentario anterior
		
	    return 0;
	}
	
	/**
	 * Obtner el número de oraciones en el documento.
	 * Una oración es definida como un string fe caracteres
	 * que terminan con un punto, signo de exclamación
	 * o signo de pregunta (. ! o ?) o el útltimo conjunto
	 * de caracteres en un documento, incluso si no termina
	 * con una marca de puntuación.
	 * (Revisar los ejemplos en el método main más abajo para ayuda).
	 * 
	 * Este método debe procesar el string de texto completo cada vez que es llamado.
	 * 
	 * @return El número de oraciones en un documento.
	 */
	@Override
	public int obtenerNumOraciones(){
	    //TAREA: Implementar este método.
        return 0;
	}
	
	/**
	 * Obtner el número total de sílabas en el documento (El texto almacenado).
	 * Para contar el número de sílabas en una palabra, debe seguir la siguiente regla:
	 * 		Cada secuencia contigua de una o más vocales es una sílaba, 
	 *      con la siguiente excepción: una "e" solitaria al final de una palabra
	 *      no se considera una sílaba a menos que la palabra no tenga otras sílabas
	 *      Debe considerar la letra "y" como una vocal.
	 * (Revisar los ejemplos en el método main más abajo para ayuda).
	 * 
	 * Este método debe procesar el string de texto completo cada vez que es llamado.
	 * 
	 * @return El número de sílabas en un documento.
	 */
	
	@Override
	public int obtenerNumSilabas(){
	    //Tarea: Implementar este método.
        // Note que no hay necesidad de usar una expresión regular
		// para contar sílabas. Se recomienda implementar la función auxiliar 
		// contarSilabas en Documento.java usando un loop y llamando cada palabra.
        return 0;
	}
	
	/* Método main para probar esta clase.
	 * 
	 * Debe agregar sus pruebas propias.
	 * Pruebas originales, es decir, ÚNICAS reciben bonificación.
	*/
	public static void main(String[] args){
		
		
		/* 
		 * Cada prueba de casos usa el método "pruebasCaso".
		 * El primero argumento es un objeto Documento, 
		 * creado con el texto que se muestra.
		 * Los 3 siguientes argumentos son el número de sílabas, 
		 * palabras y oraciones en el string, respectivamente.
		 * Usted puede usar estos ejemplos para mejorar su entendimiento sobre
		 * cómo contar sílabas, palabras y oraciones.
		 * 
		 * 
	
		 */
		pruebasCaso(new DocumentoBasico("Pruebas.  varias???  "
		        + "Oracioooooooones hay varias... son X!  Cierto?"),
				16, 13, 5);
		pruebasCaso(new DocumentoBasico(""), 0, 0, 0);
		pruebasCaso(new DocumentoBasico("oraciones, con, muchas, de, comas.!  "
		        + "(And some poaren)).  La salida es: 7.5."), 15, 11, 4);
		pruebasCaso(new DocumentoBasico("muchas?????  oracioooooones son"), 6, 3, 2);
		
		pruebasCaso(new DocumentoBasico("dana cide dana es jeje!."),
		         32, 15, 1);
	}
	
}