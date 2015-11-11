package br.ufg.inf.es.construcao.algoritmo20;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RazaoAureaTest {
    RazaoAurea razaoAurea;

    @Before
    public void setUp() {
        razaoAurea = new RazaoAurea();
    }

    @Test
    public void testCalculaRazaoAurea() {
        assertEquals(1.6, razaoAurea.calculaRazaoAurea(2.0, 3.0, 4.0), 0.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaRazaoAureaTermoUmIgualZero() {
        razaoAurea.calculaRazaoAurea(0.0, 3.0, 4.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaRazaoAureaTermoDoisMenorTermoUm() {
        razaoAurea.calculaRazaoAurea(3.0, 3.0, 2.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaRazaoAureaFatorIgualZero() {
        razaoAurea.calculaRazaoAurea(3.0, 3.0, 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaRazaoAureaTodosArgumentosInvalidos() {
        razaoAurea.calculaRazaoAurea(0.0, 0.0, 0.0);
    }
}