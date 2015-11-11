package br.ufg.inf.es.construcao.algoritmo36;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquacaoTest {
    Equacao equacao;

    @Before
    public void setUp() {
        equacao = new Equacao();
    }

    @Test
    public void testResolveEquacao() {
        assertEquals(6683, equacao.resolveEquacao());
    }
}