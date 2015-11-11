package br.ufg.inf.es.construcao.algoritmo29;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RaizQuadradaTest {
    RaizQuadrada raizQuadrada;

    @Before
    public void setUp() {
        raizQuadrada = new RaizQuadrada();
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