package br.ufg.inf.es.construcao.algoritmo13;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroHarmonicoTest {
    NumeroHarmonico numeroHarmonico;

    public NumeroHarmonicoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        numeroHarmonico = new NumeroHarmonico();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculaNumeroHarmonicoDeUm() {
        assertEquals(1.0, numeroHarmonico.calculaNumeroHarmonico(1.0), 0.0);
    }
    
    public void testCalculaNumeroHarmonicoDeDois() {
        assertEquals(1.5, numeroHarmonico.calculaNumeroHarmonico(2.0), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaNumeroHarmonicoDeZeroLancaExcecao() {
        numeroHarmonico.calculaNumeroHarmonico(0.0);
    }
}