package br.ufg.inf.es.construcao.algoritmo19;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LognTest {
    Logn logn;

    @Before
    public void setUp() {
        logn = new Logn();
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