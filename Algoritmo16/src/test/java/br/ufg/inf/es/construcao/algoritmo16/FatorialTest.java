package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Netsteller
 */
public class FatorialTest {
    
    Fatorial fatorial;
    
    public FatorialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fatorial = new Fatorial();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void calculaFatorial_nIgualA1_1() {
        int n = 1;
        int resultadoExperado = 1;
        int resultado = fatorial.calculaFatorial(n);
        assertEquals(resultadoExperado, resultado);
    }

    @Test
    public void calculaFatorial_nIgualA3_6() {
        int n = 3;
        int resultadoExperado = 6;
        int resultado = fatorial.calculaFatorial(n);
        assertEquals(resultadoExperado, resultado);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void calculaFatorial_nMenorQue3_ExcecaoLancada() {
        int n = 0;
        int resultado = fatorial.calculaFatorial(n);
    }
}