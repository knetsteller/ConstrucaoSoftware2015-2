package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {    
    Fatorial fatorial;
    
    public FatorialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fatorial = new Fatorial();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalculaFatorialNIgualAUm() {
        assertEquals(1, fatorial.calculaFatorial(1));
    }

    @Test
    public void testCalculaFatorialNMaiorQueUm() {
        assertEquals(6, fatorial.calculaFatorial(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaFatorialNMenorQueTres() {
        fatorial.calculaFatorial(0);
    }
}