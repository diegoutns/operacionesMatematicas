/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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
    public void testDividir() throws Exception {
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
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividirResultadoNoEntero() {
        System.out.println("Test DividirResultadoNoEntero");
        int dividendo = 1;
        int divisor = 3;
        Calculadora instance = new Calculadora();
        String expResult = "Error resultado no entero";
        String result = "";
        try {
            instance.Dividir(dividendo, divisor);
        } catch (Exception ex) {
            result = ex.getMessage();
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Dividir.");
    }
    @Test
    public void testDividirPorCero() {
        System.out.println("Test DividirPorCero");
        int dividendo = 3;
        int divisor = 0;
        Calculadora instance = new Calculadora();
        String expResult = "Error division por cero";
        String result = "";
        try {
            instance.Dividir(dividendo, divisor);
        } catch (Exception ex) {
            result = ex.getMessage();
        }
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
    
    @Test
    public void testSumarNumerosRacionales() {
        System.out.println("Test Sumar");
        int sumando1 = (int) 1.4;
        int sumando2 = (int) 3.5;
        Calculadora instance = new Calculadora();
        float expResult = (float)4.9;
        int result = instance.Sumar(sumando1, sumando2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallo Sumar.");
    }
    
    /**
     * Test of Precedencia Operadores method, of class Calculadora.
     */
    @Test
    public void tesPrecedenciaOperadores() {
        System.out.println("Test Precedencia Operadores");
        String operacion = "32+21*5";
        Calculadora instance = new Calculadora();
        int expResult = 137;
        int result = instance.Operar(operacion);
        assertEquals(expResult, result);
    }
    /**
     * Test of Precedencia Parentesis method, of class Calculadora.
     */
    @Test
    public void tesPrecedenciaParentesis() {
        System.out.println("Test Precedencia Parentesis");
        String operacion = "26*(21-15)";
        Calculadora instance = new Calculadora();
        int expResult = 156;
        int result = instance.Operar(operacion);
        assertEquals(expResult, result);
    }

}
