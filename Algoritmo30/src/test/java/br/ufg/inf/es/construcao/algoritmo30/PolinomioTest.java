package br.ufg.inf.es.construcao.algoritmo30;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolinomioTest {
    Polinomio polinomio;
    int[] array = {0, 1, 2, 3};

    @Before
    public void setUp() {
        polinomio = new Polinomio();
    }

    @Test
    public void testCalculapolinomio() {
        assertEquals(5, polinomio.calculapolinomio(1, 4, array));
    }

}