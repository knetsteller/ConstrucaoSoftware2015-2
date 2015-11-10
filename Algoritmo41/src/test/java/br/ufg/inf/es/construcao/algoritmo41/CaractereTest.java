package br.ufg.inf.es.construcao.algoritmo41;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaractereTest {
    Caractere caractere;

    @Before
    public void setUp() {
        caractere = new Caractere();
    }

    @Test
    public void testInverteCaracteresCincoCaracteres() {
        assertEquals("stack", caractere.inverteCaracteres("kcats"));
    }
    
    @Test
    public void testInverteCaracteresOitoCaracteres() {
        assertEquals("overflow", caractere.inverteCaracteres("wolfrevo"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInverteCaracteresStringVazia() {
        caractere.inverteCaracteres("");
    }
    
}