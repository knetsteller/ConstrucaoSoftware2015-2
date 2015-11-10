package br.ufg.inf.es.construcao.algoritmo23;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaDivisoresTest {
    SomaDivisores sd;

    @Before
    public void setUp() {
        sd = new SomaDivisores();
    }

    @Test
    public void testAplicaSomaDivisores() {
        assertEquals(1, sd.aplicaSomaDivisores(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaSomaDivisoresNIgualZero() {
        sd.aplicaSomaDivisores(0);
    }
}