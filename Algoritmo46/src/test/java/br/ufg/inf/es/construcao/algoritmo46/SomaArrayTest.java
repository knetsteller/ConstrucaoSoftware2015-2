package br.ufg.inf.es.construcao.algoritmo46;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaArrayTest {
    SomaArray somaArray;
    int[] array = {1, 2, 3, 4, 5};

    @Before
    public void setUp() {
        somaArray = new SomaArray();
    }

    @Test
    public void testSomaValoresDoArrayNMaiorQueZero() {
        assertEquals(10, somaArray.somaValoresDoArray(array, 4));
    }
    
    @Test
    public void testSomaValoresDoArrayNIgualZero() {
        assertEquals(1, somaArray.somaValoresDoArray(array, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSomaValoresDoArrayNMenorQueZero() {
        somaArray.somaValoresDoArray(array, -1);
    }
}