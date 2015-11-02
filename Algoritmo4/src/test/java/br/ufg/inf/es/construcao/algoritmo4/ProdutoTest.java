
package br.ufg.inf.es.construcao.algoritmo4;

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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of calculaProduto method, of class Produto.
     */
    @Test
    public void testCalculaProduto() {
        System.out.println("calculaProduto");
        int a = 2;
        int b = 3;
        Produto instance = new Produto();
        int expResult = 6;
        int result = instance.calculaProduto(a, b);
        assertEquals(expResult, result);
    }
    
}
