package br.ufg.inf.es.construcao.algoritmo32;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibonnaci;

    @Before
    public void setUp() {
        fibonnaci = new Fibonacci();
    }

    @Test
    public void testCalculaFibonacci() {
        assertEquals(21, fibonnaci.calculaFibonacci(8));
    }
    
    @Test
    public void testCalculaFibonacciNIgualZero() {
        fibonnaci.calculaFibonacci(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaFibonacciNMenorZero() {
        fibonnaci.calculaFibonacci(-1);
    }
    
}