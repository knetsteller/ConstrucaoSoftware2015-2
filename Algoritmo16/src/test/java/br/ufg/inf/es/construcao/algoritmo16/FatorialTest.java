package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {    
    Fatorial fatorial;
    
    @Before
    public void setUp() {
        fatorial = new Fatorial();
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