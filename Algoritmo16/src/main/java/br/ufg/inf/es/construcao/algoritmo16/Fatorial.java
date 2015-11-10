package br.ufg.inf.es.construcao.algoritmo16;

/**
 * Classe que contendo método para cálculo de fatorial.
 */
public class Fatorial {
    
    /**
     * Calcula o fatorial do inteiro n fornecido.
     * @param n Inteiro cujo fatorial será calculado.
     * @return Inteiro correspondente ao fatorial de n.
     * @throws IllegalArgumentException se n é menor que 1.
     */
    public int calculaFatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        int contador = 2;
        int fatorial = 1;
        
        while (contador <= n) {            
            fatorial *= contador;
            contador += 1;
        }
        
        return fatorial;
    }
}
