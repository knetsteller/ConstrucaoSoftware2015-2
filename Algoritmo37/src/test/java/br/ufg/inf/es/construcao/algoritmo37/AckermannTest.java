package br.ufg.inf.es.construcao.algoritmo37;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AckermannTest {
    Ackermann ackermann;

    @Before
    public void setUp() {
        ackermann = new Ackermann();
    }
    
    @Test
    public void testAplicaFuncaoDeAckermann() {
        assertEquals(7, ackermann.aplicaFuncaoDeAckermann(2, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaFuncaoDeAckermannXInvalido() {
        ackermann.aplicaFuncaoDeAckermann(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaFuncaoDeAckermannYInvalido() {
        ackermann.aplicaFuncaoDeAckermann(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAplicaFuncaoDeAckermannInvalido() {
        ackermann.aplicaFuncaoDeAckermann(-1, -1);
    }
    
}