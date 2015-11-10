package br.ufg.inf.es.construcao.algoritmo3;

/**
 * Classe contendo método para calcular a soma de n inteiros.
 */
public class SomaNaturais {
    
    /**
     * Calcula o somatório de n inteiros.
     * @param n Inteiro até onde deve-se calcular a soma.
     * @return Inteiro correspondente ao somatório de n inteiros.
     */
    public int calculaSomaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O numero deve ser maior ou igual a1");
        }
        int i = 2;
        int s = 1;
        
        while (i <= n) {            
            s += i;
            i += 1;
        }
        
        return s;
    }
}
