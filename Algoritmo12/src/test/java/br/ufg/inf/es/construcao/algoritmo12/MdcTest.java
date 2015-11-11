package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MdcTest {
    Mdc mdc;

    @Before
    public void setUp() {
        mdc = new Mdc();
    }

    @Test
    public void testCalculaMaximoDivisorAIgual4BIgual2() {
        assertEquals(2, mdc.calculaMaximoDivisorComum(4, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorAMenorQueB() {
        mdc.calculaMaximoDivisorComum(2, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorBIgualZero() {
        mdc.calculaMaximoDivisorComum(2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorAInvalidoBInvalido() {
        mdc.calculaMaximoDivisorComum(-2, -1);
    }
}