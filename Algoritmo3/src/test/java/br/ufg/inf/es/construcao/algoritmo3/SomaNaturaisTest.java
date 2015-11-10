package br.ufg.inf.es.construcao.algoritmo3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturaisTest {
    SomaNaturais somaNaturais;

    @Before
    public void setUp() {
        somaNaturais = new SomaNaturais();
    }

    @Test
    public void testCalculaSomaNaturaisNIgualUm() {
        assertEquals(1, somaNaturais.calculaSomaNaturais(1));
    }
    
    @Test
    public void testCalculaSomaNaturaisNIgualDois() {
        assertEquals(3, somaNaturais.calculaSomaNaturais(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaSomaNaturaisDeZeroLancaExcecao() {
        somaNaturais.calculaSomaNaturais(0);
    }
}