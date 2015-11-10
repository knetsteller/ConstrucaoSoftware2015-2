package br.ufg.inf.es.construcao.algoritmo17;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AritmeticaTest {
    Aritmetica aritmetica;

    @Before
    public void setUp() {
        aritmetica = new Aritmetica();
    }
    
    @Test
    public void testCalculaFatorialNIgualUm() {
        assertEquals(1, aritmetica.calculaFatorial(1));
    }
    
    @Test
    public void testCalculaFatorialNMaiorQueUm() {
        assertEquals(2, aritmetica.calculaFatorial(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaFatorialNMenorQueUm() {
        aritmetica.calculaFatorial(0);
    }
}