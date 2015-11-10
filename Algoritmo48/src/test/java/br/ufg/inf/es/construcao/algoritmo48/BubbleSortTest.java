package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;
    int[] arrayOrdenado = {1, 3, 4, 6, 8, 9};
    int[] array = {6, 9, 3, 8, 1, 4};
    int[] a = new int[6];

    public BubbleSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void tearDown() {
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