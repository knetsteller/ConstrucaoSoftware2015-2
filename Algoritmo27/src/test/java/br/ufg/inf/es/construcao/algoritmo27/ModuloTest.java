package br.ufg.inf.es.construcao.algoritmo27;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuloTest {
    Modulo modulo;

    @Before
    public void setUp() {
        modulo = new Modulo();
    }

    @Test
    public void testCalculaModuloYMaiorQueZero() {
        assertEquals(0 , modulo.calculaModulo(2, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloXIgualZero() {
        modulo.calculaModulo(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloYMenorQueZero() {
        modulo.calculaModulo(1, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloAmbosMenoresQueZero() {
        modulo.calculaModulo(-1, -1);
    }
}