package br.ufg.inf.es.construcao.algoritmo31;

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
public class PolinomioTest {
    Polinomio p;
    int[] array = {1, 2, 3};
    int[] arrayVazio = {};

    public PolinomioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new Polinomio();
    }

    @After
    public void tearDown() {
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