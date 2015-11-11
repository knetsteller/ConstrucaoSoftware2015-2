package br.ufg.inf.es.construcao.algoritmo11;

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
    public void testCalculaMaximoDivisorComum() {
        assertEquals(1, mdc.calculaMaximoDivisorComum(2, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorComumAMenorQueB() {
        mdc.calculaMaximoDivisorComum(1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorComumBIgualZero() {
        mdc.calculaMaximoDivisorComum(1, 0);
    }
}