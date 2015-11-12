package br.ufg.inf.es.construcao.algoritmo28;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class OperacaoMatematicaTest {
    OperacaoMatematica om = new OperacaoMatematica();
    PrintStream stdout = System.out;    
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() throws UnsupportedEncodingException {
        om = new OperacaoMatematica();
        System.setOut(new PrintStream(output, true, "UTF-8"));
    }
    
    @After
    public void cleanup() {
        System.setOut(stdout);
    }

    @Test
    public void testRealizaDivisaoInteiro() {
        om.realizaDivisao(2, 1, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test
    public void testRealizaDivisaoRacional() {
        om.realizaDivisao(3, 2, 1);
        String out1 = Integer.toString(1);
        String out2 = Integer.toString(5);
        String stringOut = new String(output.toByteArray());
        assertEquals(out1+","+out2, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoDividendoIgualZero() {
        om.realizaDivisao(0, 2, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoDividendoMenorQueZero() {
        om.realizaDivisao(-1, 2, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoDivisorIgualZero() {
        om.realizaDivisao(3, 0, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoDivisorMenorQueZero() {
        om.realizaDivisao(3, -1, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoAmbosIguaisZero() {
        om.realizaDivisao(0, 0, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRealizaDivisaoAmbosMenoresQueZero() {
        om.realizaDivisao(-1, -1, 1);
        String out = Integer.toString(2);
        String stringOut = new String(output.toByteArray());
        assertEquals(out, stringOut);
    }
}