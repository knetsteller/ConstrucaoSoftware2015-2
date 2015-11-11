package br.ufg.inf.es.construcao.algoritmo42;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturaisTest {
    SomaNaturais somaNaturais;

    @Before
    public void setUp() {
        somaNaturais = new SomaNaturais();
    }

    @Test
    public void testSomaNaturaisNIgualUm() {
        assertEquals(1, somaNaturais.somaNaturais(1));
    }
    
    @Test
    public void testSomaNaturaisNIgualDois() {
        assertEquals(1, somaNaturais.somaNaturais(2));
    }
    
    @Test
    public void testSomaNaturaisNIgualCinco() {
        assertEquals(1, somaNaturais.somaNaturais(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturais() {
        somaNaturais.somaNaturais(0);
    }
}