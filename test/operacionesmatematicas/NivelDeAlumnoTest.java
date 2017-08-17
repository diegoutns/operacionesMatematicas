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
 * @author Jenny
 */
public class NivelDeAlumnoTest {
    
    public NivelDeAlumnoTest() {
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
     * Test of ActualizarPuntajeDeAlumno method, of class NivelDeAlumno.
     */
    @Test
    public void testActualizarPuntajeDeAlumno() {
        System.out.println("ActualizarPuntajeDeAlumno");
        String us = "Alumno";
        int pu = 5;
        NivelDeAlumno instance = new NivelDeAlumno();
        int expResult = 27;
        int result = instance.ActualizarPuntajeDeAlumno(us, pu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        if (expResult==result) {
            System.out.println("Prueba satisfactoria");
            } else {
            //fail("The test case is a prototype.");
            System.out.println("mmmm");
            }
    }

    /**
     * Test of ActualizarNivelDeAlumno method, of class NivelDeAlumno.
     */
    @Test
    public void testActualizarNivelDeAlumno() {
        System.out.println("ActualizarNivelDeAlumno");
        String us = "Alumno";
        int pu = 5;
        NivelDeAlumno instance = new NivelDeAlumno();
        String expResult = "Nivel 2 ";
        String result = instance.ActualizarNivelDeAlumno(us, pu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result.equals("Nivel 2 ")) {
            System.out.println("Prueba satisfactoria");
        } else {
        fail("The test case is a prototype."); 
        }
        
    }
    
}
