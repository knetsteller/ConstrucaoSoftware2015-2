package br.ufg.inf.es.construcao.algoritmo31;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolinomioTest {
    Polinomio p;
    int[] array = {1, 2, 3};
    int[] arrayVazio = {};

    @Before
    public void setUp() {
        p = new Polinomio();
    }

    @Test
    public void testCalculaEsquemaDeHorner() {
        assertEquals(6, p.calculaEsquemaDeHorner(1, array));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaEsquemaDeHornerGMenorQueUm() {
        assertEquals(6, p.calculaEsquemaDeHorner(1, arrayVazio));
    }

}