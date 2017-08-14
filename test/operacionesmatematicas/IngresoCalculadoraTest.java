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
    public void testAbrirCalcuadoraSiendoDocente() {
        System.out.println("abrirCalcuadora Siendo Docente");
        String tipoUsario = "Docente";
        int nivel = 0;
        IngresoCalculadora instance = new IngresoCalculadora();
        Calculadora expResult = null;
        Calculadora result = instance.abrirCalcuadora(tipoUsario, nivel);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result==null) {
            System.out.println("XX NO supera la prueba XX");
            fail("The test case is a prototype.");
        } else {
            System.out.println("++ Pasa la prueba ++ ");
        }
        
    }
    
    /**
     * Test of abrirCalcuadora method, of class IngresoCalculadora.
     */
    @Test
    public void testAbrirCalcuadoraSiendoAlumnoAvanzado() {
        System.out.println("abrirCalcuadora Siendo Alumno Avanzado");
        String tipoUsario = "Alumno";
        int nivel = 4;
        IngresoCalculadora instance = new IngresoCalculadora();
        Calculadora expResult = null;
        Calculadora result = instance.abrirCalcuadora(tipoUsario, nivel);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result.equals(expResult)) {
            System.out.println("XX NO supera la prueba XX");
            fail("The test case is a prototype.");
        } else {
            System.out.println("++ Pasa la Prueba ++");
        }
        
    }
    /**
     * Test of abrirCalcuadora method, of class IngresoCalculadora.
     */
    @Test
    public void testAbrirCalcuadoraSiendoAlumnoPrincipiante() {
        System.out.println("abrirCalcuadora siendo Alumno Principiante **");
        String tipoUsario = "Alumno";
        int nivel = 3;
        IngresoCalculadora instance = new IngresoCalculadora();
        Calculadora expResult = null;
        Calculadora result = instance.abrirCalcuadora(tipoUsario, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result==null) {
            System.out.println("++ Pasa la Prueba ++");
        } else {
            System.out.println("XX NO supera la pueba XX");
            fail("The test case is a prototype");
        }
    }
}
