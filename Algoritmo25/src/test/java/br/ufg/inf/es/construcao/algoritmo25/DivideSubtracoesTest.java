package br.ufg.inf.es.construcao.algoritmo25;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSubtracoesTest {
    DivideSubtracoes divideSubtracoes;

    @Before
    public void setUp() {
        divideSubtracoes = new DivideSubtracoes();
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