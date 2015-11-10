package br.ufg.inf.es.construcao.algoritmo47;

import br.ufg.inf.es.construcao.algoritmo46.SomaArray;

/**
 * Classe contendo método para cálculo em array.
 */
public class MediaArray {
    
    /**
     * Calcula média dos valores dos elementos do array fornecido.
     * @param array Array de elementos
     * @param n Numero de elementos do array.
     * @return Valor correspondente a média dos elementos do array.
     */
    public double calculaMediaArray(int[] array, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        SomaArray somaArray = new SomaArray();
        double somaElementosArray = somaArray.somaValoresDoArray(array, n);
        
        return somaElementosArray / n;
    }
}
