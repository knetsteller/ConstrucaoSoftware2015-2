package br.ufg.inf.es.construcao.algoritmo23;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Netsteller
 */
public class SomaDivisoresTest {

    public SomaDivisoresTest() {
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
     * Test of aplicaSomaDivisores method, of class SomaDivisores.
     */
    @Test
    public void testAplicaSomaDivisores() {
        System.out.println("aplicaSomaDivisores");
        int n = 2;
        SomaDivisores instance = new SomaDivisores();
        int expResult = 1;
        int result = instance.aplicaSomaDivisores(n);
        assertEquals(expResult, result);
    }
}