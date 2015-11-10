package br.ufg.inf.es.construcao.algoritmo47;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MediaArrayTest {
    MediaArray mediaArray;
    int[] array = {1, 2, 3};

    public MediaArrayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mediaArray = new MediaArray();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculaMediaArrayNIgualZero() {
        assertEquals(1, mediaArray.calculaMediaArray(array, 1), 0.0);
    }
    
    @Test
    public void testCalculaMediaArray() {
        assertEquals(2, mediaArray.calculaMediaArray(array, 3), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaMediaArrayNMenorQueZero() {
        mediaArray.calculaMediaArray(array, -1);
    }

}