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
public class AccesoAlProgramaTest {
    
    public AccesoAlProgramaTest() {
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
     * Test of LoguearUsuario method, of class AccesoAlPrograma.
     */
    @Test
    public void testLoguearUsuario() {
        System.out.println("LoguearUsuario");
        String tipoUsuario = "";
        String mail = "";
        String contraseña = "";
        AccesoAlPrograma instance = new AccesoAlPrograma();
        boolean expResult = false;
        boolean result = instance.LoguearUsuario(tipoUsuario, mail, contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
