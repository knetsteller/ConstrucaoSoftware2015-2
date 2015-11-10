package br.ufg.inf.es.construcao.algoritmo2;

/**
 * Classe contendo método para verificar se um inteiro é par ou não.
 */
public class Paridade {
    
    /**
     * Determina se o inteiro n é par ou não.
     * @param n Inteiro a ser testado.
     * @return true se o inteiro é par e false se não for.
     */
    public boolean verificaParidade(int n) {
        if ((n % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
