package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MdcTest {
    Mdc mdc;

    public MdcTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mdc = new Mdc();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculaMaximoDivisorAIgual4BIgual2() {
        assertEquals(2, mdc.calculaMaximoDivisorComum(4, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorAMenorQueBLancaExcecao() {
        mdc.calculaMaximoDivisorComum(2, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorBIgualZeroLancaExcecao() {
        mdc.calculaMaximoDivisorComum(2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMaximoDivisorAInvalidoBInvalidoLancaExcecao() {
        mdc.calculaMaximoDivisorComum(-2, -1);
    }
}