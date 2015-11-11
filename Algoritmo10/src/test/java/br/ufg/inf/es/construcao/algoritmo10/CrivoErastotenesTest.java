package br.ufg.inf.es.construcao.algoritmo10;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrivoErastotenesTest {
    CrivoErastotenes ce;

    @Before
    public void setUp() {
        ce = new CrivoErastotenes();
    }
    
    @Test
    public void testCalculaCrivoEratostenesPrimo() {
        int[] array = {1, 2, 0};
        ce.calculaCrivoEratostenes(array, 2);
        assertEquals(0, array[2]);
    }
    
    @Test
    public void testCalculaCrivoEratostenesNaoPrimo() {
        int[] array = {1, 2, 0, 0, 0, 0, 0};
        ce.calculaCrivoEratostenes(array, 6);
        assertEquals(1, array[3]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculaCrivoEratostenesNMenorQueDois() {
        int[] array = null;
        ce.calculaCrivoEratostenes(array, 1);
    }
    
}