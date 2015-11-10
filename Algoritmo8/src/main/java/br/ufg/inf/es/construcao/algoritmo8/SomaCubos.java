package br.ufg.inf.es.construcao.algoritmo8;

/**
 * Classe contendo método para verficar propriedade 153.
 */
public class SomaCubos {
    
    /**
     * Verifica se a soma dos cubos de três inteiros é igual ao inteiro n.
     * @param n Inteiro a ser testado.
     * @return true se a propriedade é verdadeira e false em caso contrário.
     */
    public boolean verificaSomaDosCubos(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("n deve estar entre 0 e 999.");
        }
        
        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n % 10;
        if ((i * i * i + j * j * j + k * k * k) == n) {
            return true;
        }
        return false;        
    }
}
