package br.ufg.inf.es.construcao.algoritmo2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParidadeTest {
    Paridade paridade;

    @Before
    public void setUp() {
        paridade = new Paridade();
    }
    
    @Test
    public void testVerificaParidadeVerdadeiro() {
        assertTrue(paridade.verificaParidade(2));
    }   
    
    @Test
    public void testVerificaParidadeFalso() {
        assertFalse(paridade.verificaParidade(3));
    }   
}
