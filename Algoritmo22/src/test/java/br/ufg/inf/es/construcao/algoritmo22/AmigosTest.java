package br.ufg.inf.es.construcao.algoritmo22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AmigosTest {
    Amigos amigos;

    public AmigosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        amigos = new Amigos();
    }

    @After
    public void tearDown() {
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