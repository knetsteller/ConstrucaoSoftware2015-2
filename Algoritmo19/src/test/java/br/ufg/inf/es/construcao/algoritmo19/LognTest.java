package br.ufg.inf.es.construcao.algoritmo19;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LognTest {
    Logn logn;

    public LognTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        logn = new Logn();
    }

    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoKMenorQueDois() {
        assertEquals(3, logn.calculaLogaritmo(1.0, 1.0), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoNMenorQueUm() {
        assertEquals(3, logn.calculaLogaritmo(0.0, 2.0), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoNInvalidoKInvalido() {
        assertEquals(3, logn.calculaLogaritmo(0.0, 1.0), 0.0);
    }
}