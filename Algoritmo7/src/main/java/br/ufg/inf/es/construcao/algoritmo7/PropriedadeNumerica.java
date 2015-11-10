package br.ufg.inf.es.construcao.algoritmo7;

/**
 * Classe contendo métodos para cálculos de propriedades numéricas.
 */
public class PropriedadeNumerica {
    
    /**
     * Verifica se o quadrado da soma 
     * @param n
     * @return 
     */
    public boolean verificaQuadradoDaSoma(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("A entrada deve estar entre 0 e "
                    + "9999.");
        }
        
        int primeiroTermo = n / 100;
        int segundoTermo = n % 100;
        if ((primeiroTermo + segundoTermo) * (primeiroTermo + segundoTermo) == n) {
            return true;
        } else {
            return false;
        }
    }
}
