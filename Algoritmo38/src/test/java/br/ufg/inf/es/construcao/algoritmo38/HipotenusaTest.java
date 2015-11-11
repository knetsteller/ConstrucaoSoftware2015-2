package br.ufg.inf.es.construcao.algoritmo38;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class HipotenusaTest {
    Hipotenusa hipotenusa;
    
    @Before
    public void setUp() {
        hipotenusa = new Hipotenusa();
    }
    
    @Test
    public void testCalculaHipotenusa() {
        Assert.assertEquals(5.0, hipotenusa.calculaHipotenusa(4, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaHipotenusaLadoMenorQueUm() {
        hipotenusa.calculaHipotenusa(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaHipotenusaOutroLadoMenorQueUm() {
        hipotenusa.calculaHipotenusa(1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaHipotenusaAmbosLadosMenoresQueUm() {
        hipotenusa.calculaHipotenusa(0, 0);
    }
}
