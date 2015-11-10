
package br.ufg.inf.es.construcao.algoritmo13;

/**
 * Classe que contém método para calcular a soma dos inversos dos inteiros até n.
 */
public class NumeroHarmonico {
    
    /**
     * Calcula a soma dos inversos até n.
     * @param n Inteiro até onde deve-se calcular a soma dos inversos.
     * @return Somatório dos inversos até n.
     */
    public double calculaNumeroHarmonico(double n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        double contador = 2;
        double somatorio = 1;
        
        while (contador <= n) {            
            somatorio = somatorio + (1 / n);
            contador += 1;
        }
        
        return somatorio;
    }
}
