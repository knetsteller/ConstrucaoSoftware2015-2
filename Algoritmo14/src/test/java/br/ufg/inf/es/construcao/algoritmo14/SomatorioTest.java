package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomatorioTest {
    
    Somatorio somatorio;

    @Before
    public void setUp() {
        somatorio = new Somatorio();
    }

    @Test
    public void testCalculaSomatorioNIgualAUm() {
        assertEquals(0.5, somatorio.calculaSomatorio(1), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaSomatorioNIgualAZero() {
        somatorio.calculaSomatorio(0);
    }
}