package br.ufg.inf.es.construcao.algoritmo9;

/**
 * Classe contendo método para verificar a propriedade de inteiro ser primo.
 */
public class Primo {
    
    /**
     * Verifica se um inteiro n é primo ou não.
     * @param n Inteiro a ser testado.
     * @return true se n for primo e false caso contrário.
     */
    public boolean verificaNumeroPrimo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("O numero deve ser maior que 1.");
        }
        
        int contador = 2;
        
        while (contador <= (n - 1)) {            
            if ((n % contador) == 0) {
                return false;
            }
            contador += 1;
        }
        
        return true;
    }
}
