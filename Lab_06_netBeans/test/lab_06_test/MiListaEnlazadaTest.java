/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import lab_06_netbeans.*;
import org.junit.Ignore;

/**
 * @author Pablo Valenzuela Ayuda: 
 * https://www.journaldev.com/11444/java-list
 */
public class MiListaEnlazadaTest {

	private static final int LONG_LIST_LENGTH =10; 

	MiListaEnlazada<String> shortList;
	MiListaEnlazada<Integer> emptyList;
	MiListaEnlazada<Integer> longerList;
	MiListaEnlazada<Integer> list1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Puede usar estas listaso puede añadir otras
	    shortList = new MiListaEnlazada<String>();
		shortList.add("A");
		shortList.add("B");
		emptyList = new MiListaEnlazada<Integer>();
		longerList = new MiListaEnlazada<Integer>();
		for (int i = 0; i < LONG_LIST_LENGTH; i++)
		{
			longerList.add(i);
		}
		list1 = new MiListaEnlazada<Integer>();
		list1.add(65);
		list1.add(21);
		list1.add(42);
		
	}
	
	/**
	 * Prueba si el método get funciona correctamente. Usted no debería añadir
	 * funcionalidades a este método. Esta prueba, se presenta como un ejemplo
	 * completo.
	 */
	@Test
	public void testGet(){
		for(int i = 0; i< shortList.size(); i++){
                    System.out.println(shortList.get(i));
                }

// prueba lista vacía, obtener (get) debe lanzar una excepción
		// el método debería retornar un excepción, sino lo hace, usa fail
		try {
			emptyList.get(0);
			fail("Comprueba si está fuera de límite");
		}
		catch (IndexOutOfBoundsException e) {
			
		}
		
		// prueba lista corta (shortlist), primero contenido, luego fuera de límite
		// assertEquals compara "A" con shortList.get(0), sino retorna (throws) un error
		assertEquals("Comprueba primero", "A", shortList.get(0));
		assertEquals("Comprueba segundo", "B", shortList.get(1));
                
                
		
		try {
			shortList.get(-1);
			fail("Comprueba si está fuera de límite");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			shortList.get(2);
			fail("Comprueba si está fuera de límite");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		// prueba contenido de la lista más grande (longerList)
		for(int i = 0; i<LONG_LIST_LENGTH; i++ ) {
			assertEquals("Comprueba el elemento " + i, (Integer)i, longerList.get(i));
		}
		
		// prueba límite de la lista más grande (longerList)
		try {
			longerList.get(-1);
			fail("Comprueba si está fuera de límite");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			longerList.get(LONG_LIST_LENGTH);
			fail("Comprueba si está fuera de límite");
		}
		catch (IndexOutOfBoundsException e) {
		}
		
	}
	
	
	/**
	 * Prueba de remover un elemento desde la lista. Usted deberá agregar otras
	 * pruebas si lo condisera necesario
	 */
	@Ignore
	public void testRemove(){
		int a = list1.remove(0);
		assertEquals("Remueve: Prueba si es correcto ", 65, a);
		assertEquals("Remueve: Prueba si el elemento 0 es correcto", (Integer)21, list1.get(0));
		assertEquals("Remueve: Prueba si tamaño es correcto", 2, list1.size());
		
		// Hacer: Agregar más pruebas aquí
	}
	
	/**
	 * Prueba agregar un elemento al final de la lista, 
	 * específicamente public boolean add(E element)
	 */
	@Ignore
	public void testAddEnd(){
		// Hacer: implementar este test
		
	}

	
	/** Prueba el tamaño de la lista */
	@Ignore
	public void testSize(){
		/// Hacer: implementar este test
	}

	
	/**
	 * Prueba agregar un elemento en la lista en un posición (index) específica,
	 * específicamente: public void add(int index, E element)
	 */
	@Ignore
	public void testAddAtIndex(){
		// Hacer: implementar este test
		
	}
	
	/** Prueba reemplazar un elemento en la lista */
	@Ignore
	public void testSet(){
		// Hacer: implementar este test
	    
	}
	
	// Hacer: Opcionalmente, puede añadir más métodos de prueba
	
}
