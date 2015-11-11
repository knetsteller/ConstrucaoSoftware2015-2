package br.ufg.inf.es.construcao.algoritmo24;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSomasTest {
    DivideSomas divideSomas;

    @Before
    public void setUp() {
        divideSomas = new DivideSomas();
    }

    @Test
    public void testAplicaDivideSomasTermoUmIgualZero() {
        assertEquals(0, divideSomas.aplicaDivideSomas(0, 2));
    }
    
    @Test
    public void testAplicaDivideSomas() {
        assertEquals(0, divideSomas.aplicaDivideSomas(1, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaDivideSomasTermoUmMenorQueZero() {
        divideSomas.aplicaDivideSomas(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaDivideSomasTermoDoisIgualZero() {
        divideSomas.aplicaDivideSomas(2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaDivideSomasAmbosTermosInvalidos() {
        divideSomas.aplicaDivideSomas(2, 0);
    }
}