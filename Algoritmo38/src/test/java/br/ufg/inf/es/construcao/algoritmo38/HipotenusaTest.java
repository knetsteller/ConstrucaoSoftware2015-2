package br.ufg.inf.es.construcao.algoritmo38;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HipotenusaTest {
    Hipotenusa hipotenusa;
    
    public HipotenusaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        hipotenusa = new Hipotenusa();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalculaHipotenusaAmbosLadosIguaisUm() {
        hipotenusa.calculaHipotenusa(1, 1);
    }
    
    @Test
    public void testCalculaHipotenusaAmbosLadosMaioresQueUm() {
        hipotenusa.calculaHipotenusa(2, 2);
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
