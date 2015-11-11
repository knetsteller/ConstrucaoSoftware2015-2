package br.ufg.inf.es.construcao.algoritmo21;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {
    QuadradoPerfeito quadradoPerfeito;

    @Before
    public void setUp() {
        quadradoPerfeito = new QuadradoPerfeito();
    }

    @Test
    public void testVerificaQuadradoPerfeitoTrue() {
        assertTrue(quadradoPerfeito.verificaQuadradoPerfeito(16));
    }
    
    @Test
    public void testVerificaQuadradoPerfeitoFalse() {
        assertFalse(quadradoPerfeito.verificaQuadradoPerfeito(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaQuadradoPerfeitoNMenorQueUmLancaExcecao() {
        quadradoPerfeito.verificaQuadradoPerfeito(0);
    }
}