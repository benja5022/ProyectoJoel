/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vicente
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartido method, of class Persona.
     */
    @Test
    public void testGetPartido() {
        System.out.println("getPartido");
        Persona instance = null;
        String expResult = "";
        String result = instance.getPartido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartido method, of class Persona.
     */
    @Test
    public void testSetPartido() {
        System.out.println("setPartido");
        String partido = "";
        Persona instance = null;
        instance.setPartido(partido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVotos method, of class Persona.
     */
    @Test
    public void testGetVotos() {
        System.out.println("getVotos");
        Persona instance = null;
        int expResult = 0;
        int result = instance.getVotos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotos method, of class Persona.
     */
    @Test
    public void testSetVotos() {
        System.out.println("setVotos");
        int votos = 0;
        Persona instance = null;
        instance.setVotos(votos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class Persona.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Persona instance = null;
        instance.agregar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", 0);
        }

        public void agregar() {
        }
    }
    
}
