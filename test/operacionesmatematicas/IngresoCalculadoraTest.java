/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valeria
 */
public class IngresoCalculadoraTest {
    
    public IngresoCalculadoraTest() {
    }
    
    @BeforeClass
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
     * Test of abrirCalcuadora method, of class IngresoCalculadora.
     */
    @Test
    public void testAbrirCalcuadora() {
        System.out.println("abrirCalcuadora");
        String tipoUsario = "";
        int nivel = 0;
        IngresoCalculadora instance = new IngresoCalculadora();
        Calculadora expResult = null;
        Calculadora result = instance.abrirCalcuadora(tipoUsario, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
