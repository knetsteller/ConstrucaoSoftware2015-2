package br.ufg.inf.es.construcao.algoritmo4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {
    Produto produto;

    @Before
    public void setUp() {
        produto = new Produto();
    }
    
    @Test
    public void testCalculaProdutoABIgualZero() {
        assertEquals(0, produto.calculaProduto(0, 0));
    }
    
    @Test
    public void testCalculaProduto() {
        assertEquals(1, produto.calculaProduto(1, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaProdutoAMenorQueZero() {
        assertEquals(1, produto.calculaProduto(-1, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaProdutoBMenorQueZero() {
        assertEquals(1, produto.calculaProduto(1, -1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaProdutoAMenorQueZeroBMenorQueZero() {
        assertEquals(1, produto.calculaProduto(-1, -1));
    }
}
