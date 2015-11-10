package br.ufg.inf.es.construcao.algoritmo8;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaCubosTest {
    SomaCubos somaCubos;

    @Before
    public void setUp() {
        somaCubos = new SomaCubos();
    }

    @Test
    public void testVerificaSomaDosCubosNIgualZero() {
        assertTrue(somaCubos.verificaSomaDosCubos(0));
    }
    
    @Test
    public void testVerificaSomaDosCubosNIgual999() {
        assertFalse(somaCubos.verificaSomaDosCubos(999));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaSomaDosCubosNMenorQueZero() {
        somaCubos.verificaSomaDosCubos(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaSomaDosCubosNMaiorQue999() {
        somaCubos.verificaSomaDosCubos(1000);
    }

}