package br.ufg.inf.es.construcao.algoritmo21;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {
    QuadradoPerfeito quadradoPerfeito;

    public QuadradoPerfeitoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        quadradoPerfeito = new QuadradoPerfeito();
    }

    @After
    public void tearDown() {
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