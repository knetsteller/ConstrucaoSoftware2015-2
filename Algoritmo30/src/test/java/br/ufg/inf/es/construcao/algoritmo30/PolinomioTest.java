package br.ufg.inf.es.construcao.algoritmo30;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolinomioTest {
    Polinomio polinomio;
    int[] array1 = {0};
    int[] array2 = {0, 2};
    int[] arrayVazio = {};

    @Before
    public void setUp() {
        polinomio = new Polinomio();
    }

    @Test
    public void testCalculapolinomioGIgualUm() {
        assertEquals(0, polinomio.calculapolinomio(1, array1));
    }
    
    @Test
    public void testCalculapolinomioGIgualDois() {
        assertEquals(2, polinomio.calculapolinomio(1, array2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculapolinomioGIgualZero() {
        polinomio.calculapolinomio(1, arrayVazio);
    }
}