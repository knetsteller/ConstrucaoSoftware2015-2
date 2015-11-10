package br.ufg.inf.es.construcao.algoritmo7;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropriedadeNumericaTest {
    PropriedadeNumerica propriedade;

    @Before
    public void setUp() {
        propriedade = new PropriedadeNumerica();
    }

    @Test
    public void testVerificaQuadradoDaSomaIgualUm() {
        assertTrue(propriedade.verificaQuadradoDaSoma(0));
    }
    
    @Test
    public void testVerificaQuadradoDaSomaNIgualDois() {
        assertFalse(propriedade.verificaQuadradoDaSoma(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaQuadradoDaSomaNMenorQueZero() {
        assertFalse(propriedade.verificaQuadradoDaSoma(-1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaQuadradoDaSomaNMaiorQue9999() {
        assertFalse(propriedade.verificaQuadradoDaSoma(10000));
    }

}