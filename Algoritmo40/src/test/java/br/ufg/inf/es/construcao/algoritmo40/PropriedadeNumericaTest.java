package br.ufg.inf.es.construcao.algoritmo40;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropriedadeNumericaTest {
    PropriedadeNumerica pn;

    public PropriedadeNumericaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pn = new PropriedadeNumerica();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testVerificaSomaFatores() {
        assertTrue(pn.verificaSomaFatores(500));
    }
}