package br.ufg.inf.es.construcao.algoritmo5;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaTest {
    Potencia potencia;
    
    @Before
    public void setUp() {
        potencia = new Potencia();
    }

    @Test
    public void testCalculaPotenciaXIgualTresYIgualDois() {
        assertEquals(9, potencia.calculaPotencia(3, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaXIgualZero() {
        potencia.calculaPotencia(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaYMenorQueZero() {
        potencia.calculaPotencia(1, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaXMenorQueZeroYMenorQueZero() {
        potencia.calculaPotencia(-1, -1);
    }
    
}
