package br.ufg.inf.es.construcao.algoritmo43;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermutaTest {
    Permuta permuta;
    
    @Before
    public void setUp() {
        permuta = new Permuta();
    }
    
    @Test
    public void testRealizaPermutaCasoTrivial() {
        List<String> retorno = permuta.realizaPermuta("", "a", new ArrayList<String>());
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("a", retorno.get(0));
    }

    @Test
    public void testRealizaPermutaOutroCasoTrivial() {
        List<String> retorno = permuta.realizaPermuta("", "ab", new ArrayList<String>());
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("ab"));
        Assert.assertTrue(retorno.contains("ba"));
    }

    @Test
    public void testRealizaPermutaOutroCasoNaoTrivial() {
        List<String> retorno = permuta.realizaPermuta("", "abcd", new ArrayList<String>());
        Assert.assertEquals(24, retorno.size());
    }
}