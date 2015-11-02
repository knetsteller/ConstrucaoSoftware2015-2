/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.algoritmo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Netsteller
 */
public class DiaSemanaTest {
    
    public DiaSemanaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaDiaDaSemana method, of class DiaSemana.
     */
    @Test
    public void testCalculaDiaDaSemana() {
        System.out.println("calculaDiaDaSemana");
        int dia = 1;
        int mes = 11;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = 1;
        int result = instance.calculaDiaDaSemana(dia, mes, ano);
        assertEquals(expResult, result);
    }    
}
