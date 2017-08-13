/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DiegoB
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Test Sumar");
        int sumando1 = 1;
        int sumando2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 3;
        int result = instance.Sumar(sumando1, sumando2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Sumar.");
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Test Restar");
        int restando1 = 2;
        int restando2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Restar(restando1, restando2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Restar.");
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Test Dividir");
        int dividendo = 4;
        int divisor = 2;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.Dividir(dividendo, divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Dividir.");
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Test Multiplicar");
        int multiplicando1 = 3;
        int multiplicando2 = 4;
        Calculadora instance = new Calculadora();
        int expResult = 12;
        int result = instance.Multiplicar(multiplicando1, multiplicando2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Multiplicar.");
    }
    
}
