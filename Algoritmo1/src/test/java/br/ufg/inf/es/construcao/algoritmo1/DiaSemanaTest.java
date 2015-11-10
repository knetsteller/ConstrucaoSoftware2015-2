package br.ufg.inf.es.construcao.algoritmo1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiaSemanaTest {
    DiaSemana diaSemana;
    
    @Before
    public void setUp() {
        diaSemana = new DiaSemana();
    }

    @Test
    public void testCalculaDiaDaSemanaSeteNovembro2015() {
        assertEquals(6, diaSemana.calculaDiaDaSemana(7, 11, 2015));
    }  
    
    @Test
    public void testCalculaDiaDaSemanaUmJaneiro1753() {
        assertEquals(1, diaSemana.calculaDiaDaSemana(1, 1, 1753));
    }  
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaDiaMenorQue1() {
        diaSemana.calculaDiaDaSemana(0, 1, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaDiaMaiorQue31() {
        diaSemana.calculaDiaDaSemana(1, 32, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaMesMenorQue1() {
        diaSemana.calculaDiaDaSemana(1, 0, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaMesMaiorQue12() {
        diaSemana.calculaDiaDaSemana(1, 13, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaAnoMenor1753() {
        diaSemana.calculaDiaDaSemana(1, 1, 1752);
    } 
}
