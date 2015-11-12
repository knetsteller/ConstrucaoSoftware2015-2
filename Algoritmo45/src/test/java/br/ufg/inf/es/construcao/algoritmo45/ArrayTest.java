package br.ufg.inf.es.construcao.algoritmo45;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.junit.After;

public class ArrayTest {
    Array array;
    int[] sequencia = {1, 1, 1};
    PrintStream stdout = System.out;    
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() throws UnsupportedEncodingException {
        array = new Array();
        System.setOut(new PrintStream(output, true, "UTF-8"));
    }
    
    @After
    public void cleanup() {
        System.setOut(stdout);
    }

    @Test
    public void testImprimeArray() {
        array.imprimeArray(sequencia, 2);
        String out = Integer.toString(1);
        String stringOut = new String(output.toByteArray());
        assertEquals(out+out+out, stringOut);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testImprimeArrayElementosMenorQueZero() {
        array.imprimeArray(sequencia, -1);
        String out = Integer.toString(1);
        String stringOut = new String(output.toByteArray());
        assertEquals(out+out+out, stringOut);
    }
}