package br.ufg.inf.es.construcao.algoritmo22;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AmigosTest {
    Amigos amigos;

    @Before
    public void setUp() {
        amigos = new Amigos();
    }

    @Test
    public void testCalculaAmigosTrue() {
        assertTrue(amigos.verificaAmigos(6, 28));
    }
    
    @Test
    public void testCalculaAmigosFalse() {
        assertFalse(amigos.verificaAmigos(6, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaAmigosTermoUmIgualZero() {
        amigos.verificaAmigos(0, 5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaAmigosTermoDoisIgualZero() {
        amigos.verificaAmigos(2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaAmigosAmbosTermosIguaisZero() {
        amigos.verificaAmigos(2, 0);
    }

}