package br.ufg.inf.es.construcao.algoritmo29;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RaizQuadradaTest {
    RaizQuadrada raizQuadrada;

    public RaizQuadradaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        raizQuadrada = new RaizQuadrada();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculaRaizQuadrada() {
        assertEquals(2, raizQuadrada.calculaRaizQuadrada(4), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaRaizQuadradaRadicandoInvalido() {
        assertEquals(2, raizQuadrada.calculaRaizQuadrada(0), 0.0);
    }
}