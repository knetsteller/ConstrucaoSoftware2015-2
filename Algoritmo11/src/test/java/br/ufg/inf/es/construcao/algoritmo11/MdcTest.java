package br.ufg.inf.es.construcao.algoritmo11;

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