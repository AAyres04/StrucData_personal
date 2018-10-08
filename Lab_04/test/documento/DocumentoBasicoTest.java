/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeiruos
 */
public class DocumentoBasicoTest {
    
    public DocumentoBasicoTest() {
    }
    
    /*@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerNumPalabras method, of class DocumentoBasico.
     */
    /*@Test
    public void testObtenerNumPalabras() {
        System.out.println("obtenerNumPalabras");
        DocumentoBasico instance = null;
        int expResult = 0;
        int result = instance.obtenerNumPalabras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumOraciones method, of class DocumentoBasico.
     */
    /*@Test
    public void testObtenerNumOraciones() {
        System.out.println("obtenerNumOraciones");
        DocumentoBasico instance = null;
        int expResult = 0;
        int result = instance.obtenerNumOraciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumSilabas method, of class DocumentoBasico.
     */
    /*@Test
    public void testObtenerNumSilabas() {
        System.out.println("obtenerNumSilabas");
        DocumentoBasico instance = null;
        int expResult = 0;
        int result = instance.obtenerNumSilabas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DocumentoBasico.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DocumentoBasico.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testSilaba(){
        DocumentoBasico silaba = new DocumentoBasico("antonio");
        System.out.println(silaba.contarSilabas2("niñez"));
        System.out.println(silaba.contarSilabas2("wajajaja"));
        System.out.println(silaba.contarSilabas2("escarlata"));
        System.out.println(silaba.contarSilabas2("construcción"));
        System.out.println(silaba.contarSilabas2("aéreo"));
        System.out.println(silaba.contarSilabas2("siames"));
        System.out.println(silaba.contarSilabas2("miente")); 
        System.out.println(silaba.contarSilabas2("estrella"));
        System.out.println(silaba.contarSilabas2("trigonometría"));
    }
    
}
