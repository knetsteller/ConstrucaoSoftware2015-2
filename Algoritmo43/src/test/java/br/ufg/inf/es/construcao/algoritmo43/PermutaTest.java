package br.ufg.inf.es.construcao.algoritmo43;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermutaTest {
    Permuta permuta;

    public PermutaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        permuta = new Permuta();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRealizaPermuta() {
        assertEquals("", permuta.realizaPermuta("xyz", "string"));
    }

}