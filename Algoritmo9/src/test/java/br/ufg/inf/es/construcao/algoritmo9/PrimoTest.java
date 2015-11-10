package br.ufg.inf.es.construcao.algoritmo9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {
    Primo primo;

    public PrimoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        primo = new Primo();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testVerificaNumeroPrimoNIgualDois() {
        assertTrue(primo.verificaNumeroPrimo(2));
    }
    
    @Test
    public void testVerificaNumeroPrimoNIgualQuatro() {
        assertFalse(primo.verificaNumeroPrimo(4));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaNumeroPrimoNIgualUmLancaExcecao() {
        primo.verificaNumeroPrimo(1);
    }
}