package br.ufg.inf.es.construcao.algoritmo6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaSomaTest {
    PotenciaSoma potenciaSoma;

    @Before
    public void setUp() {
        potenciaSoma = new PotenciaSoma();
    }

    @Test
    public void testCalculaPotencia() {
        assertEquals(1, potenciaSoma.calculaPotencia(1, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaBaseIgualZeroLancaExcecao() {
        potenciaSoma.calculaPotencia(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaExpoenteIgualZeroLancaExcecao() {
        potenciaSoma.calculaPotencia(1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaExpoenteBaseIguaisZeroLancaExcecao() {
        potenciaSoma.calculaPotencia(0, 0);
    }
}