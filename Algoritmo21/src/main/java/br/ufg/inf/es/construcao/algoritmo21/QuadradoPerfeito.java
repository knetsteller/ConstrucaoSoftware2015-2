package br.ufg.inf.es.construcao.algoritmo21;

/**
 * Classe contendo método para verificação de um quadrado perfeito.
 * @author Netsteller
 */
public class QuadradoPerfeito {
    
    /**
     * Verifica se o inteiro fornecido como argumento é um quadrado perfeito.
     * @param quadrado Inteiro a ser testado.
     * @return true se o inteiro é um quadrado perfeito e false, caso contrário.
     */
    public boolean verificaQuadradoPerfeito(int quadrado) {
        if (quadrado < 1) {
            throw new IllegalArgumentException("k deve ser maior ou igual a1.");
        }
        
        int contador = 1;
        int somatorio = 1;
        while (somatorio < quadrado) {            
            contador += 2;
            somatorio += contador;
        }
        
        if (somatorio == quadrado) {
            return true;
        } else {
            return false;            
        }        
    }
}
