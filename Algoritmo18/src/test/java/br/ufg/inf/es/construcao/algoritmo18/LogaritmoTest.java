package br.ufg.inf.es.construcao.algoritmo18;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogaritmoTest {
    Logaritmo log;

    @Before
    public void setUp() {
        log = new Logaritmo();
    }
    
    @Test
    public void testCalculaLogaritmo() {
        assertEquals(2, log.calculaLogaritmo(1, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoNMenorQueUm() {
        log.calculaLogaritmo(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoKMenorQueDois() {
        log.calculaLogaritmo(1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaLogaritmoAmbosInvalidos() {
        log.calculaLogaritmo(0, 0);
    }
}