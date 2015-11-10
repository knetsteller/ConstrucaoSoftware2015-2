package br.ufg.inf.es.construcao.algoritmo26;

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
    public void testCalculaModulo() {
        assertEquals(0, modulo.calculaModulo(2, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloPrimeiroTermoIgualZero() {
        assertEquals(0, modulo.calculaModulo(0, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloSegundoTermoIgualZero() {
        assertEquals(0, modulo.calculaModulo(1, 0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaModuloAmbosTermosIguaisZero() {
        assertEquals(0, modulo.calculaModulo(0, 0));
    }

}