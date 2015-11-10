package br.ufg.inf.es.construcao.algoritmo15;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {
    Pi pi;

    @Before
    public void setUp() {
        pi = new Pi();
    }

    @Test
    public void testCalculaPi() {
        assertEquals(3.14, pi.calculaPi(6), 0.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPiNMenorQue1() {
        pi.calculaPi(-1);
    }
}