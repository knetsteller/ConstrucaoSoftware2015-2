package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;
    static int[] arrayOrdenado = {1, 3, 4, 6, 8, 9};
    static int[] array = {6, 9, 3, 8, 1, 4};
    static int[] a = new int[6];

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testOrdenaArrayPorBubbleSort() {
        assertArrayEquals(arrayOrdenado, bubbleSort.ordenaArrayPorBubbleSort(array, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testOrdenaArrayPorBubbleSortNMenorQueZero() {
        bubbleSort.ordenaArrayPorBubbleSort(array, -1);
    }
}