package br.ufg.inf.es.construcao.algoritmo25;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSubtracoesTest {
    DivideSubtracoes divideSubtracoes;

    public DivideSubtracoesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        divideSubtracoes = new DivideSubtracoes();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculaDivideSubtracoes() {
        assertEquals(0, divideSubtracoes.calculaDivideSubtracoes(1, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDivideSubtracoesTermoUmMenorQueZero() {
        divideSubtracoes.calculaDivideSubtracoes(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDivideSubtracoesTermoDoisIgualZero() {
        divideSubtracoes.calculaDivideSubtracoes(1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDivideSubtracoesAmbosTermosInvalidos() {
        divideSubtracoes.calculaDivideSubtracoes(1, 0);
    }

}