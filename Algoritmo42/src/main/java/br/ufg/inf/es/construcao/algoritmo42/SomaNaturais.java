
package br.ufg.inf.es.construcao.algoritmo42;

/**
 * Classe contendo método de subtração, recursivamente.
 */
public class SomaNaturais {
    
    /**
     * Recursivamente realiza subtração do inteiro fornecido como argumento
     * @param n Inteiro a ser feita a operação.
     * @return 1, como passo básico.
     */
    public int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        if (n == 1) {
            return 1;
        } else {
            return somaNaturais(n - 1);
        }
    }
}
