package br.ufg.inf.es.construcao.algoritmo16;

/**
 * Classe que contendo método para cálculo do fatorial do inteiro n fornecido.
 */
public class Fatorial {
    
    /**
     * @param n Inteiro cujo fatorial será calculado.
     * @return Inteiro correspondente ao fatorial de n.
     * @throws IllegalArgumentException se n é menor que 1.
     */
    public int calculaFatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        int i = 2;
        int f = 1;
        
        while (i <= n) {            
            f *= i;
            i += 1;
        }
        
        return f;
    }
}
