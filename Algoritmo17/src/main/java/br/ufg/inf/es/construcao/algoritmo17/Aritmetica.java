package br.ufg.inf.es.construcao.algoritmo17;

import br.ufg.inf.es.construcao.algoritmo4.Produto;

/**
 * Classe contendo método usado com fatoriais.
 */
public class Aritmetica {
    
    /**
     * Realiz
     * @param n
     * @return 
     */
    public int calculaFatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("A entrada deve ser maior ou"
                    + "igual a 1.");
        }
        
        Produto produto = new Produto();
        int contador = 2;
        int fatorial = 1;
        while (contador <= n) {            
            fatorial = produto.calculaProduto(fatorial, contador);
            contador += 1;
        }
        
        return fatorial;
    }
}
