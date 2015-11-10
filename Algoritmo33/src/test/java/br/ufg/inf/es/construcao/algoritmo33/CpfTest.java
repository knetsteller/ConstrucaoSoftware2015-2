package br.ufg.inf.es.construcao.algoritmo33;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CpfTest {
    Cpf cpf;
    int[] cadastroValido = {2, 5, 2, 5, 9, 8, 5, 1, 2, 5, 0};
    int[] cadastroInvalido = {0, 0, 0, 0, 0, 1, 1, 1, 2, 1, 0};
    int[] cadastroMenosDigitos = {1, 5, 1, 5, 9, 1, 1, 1, 2, 1};
    int[] cadastroMaisDigitos = {1, 5, 1, 5, 9, 1, 1, 1, 2, 1, 0, 0};

    @Before
    public void setUp() {
        cpf = new Cpf();
    }

    @Test(expected = NullPointerException.class)
    public void testVerificaCPFNull() {
        Cpf.verificaCPF(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaCPFMenosDigitos() {
        assertTrue(cpf.verificaCPF(cadastroMenosDigitos));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaCPFMaisDigitos() {
        assertTrue(cpf.verificaCPF(cadastroMaisDigitos));
    }

    @Test
    public void testVerificaCPFTrue() {
        assertTrue(cpf.verificaCPF(cadastroValido));
    }
    
    @Test
    public void testVerificaCPFFalse() {
        assertFalse(cpf.verificaCPF(cadastroInvalido));
    }

}