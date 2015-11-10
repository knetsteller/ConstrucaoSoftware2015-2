package br.ufg.inf.es.construcao.algoritmo26;

import br.ufg.inf.es.construcao.algoritmo25.DivideSubtracoes;

/**
 * Classe contendo método para operação aritmética.
 */
public class Modulo {
    
    /**
     * Realiza a operação módulo.
     * @param primeiroTermo Primeiro termo.
     * @param segundoTermo Segundo termo.
     * @return Inteiro correspondente ao módulo.
     */
    public int calculaModulo(int primeiroTermo, int segundoTermo) {
        if (primeiroTermo <= 0 || segundoTermo <= 0) {
            throw new IllegalArgumentException("As entradas devem ser maiores "
                    + "que 0.");
        }
        
        DivideSubtracoes ds = new DivideSubtracoes();
        int d = ds.calculaDivideSubtracoes(primeiroTermo, segundoTermo);
        
        return primeiroTermo - (d * segundoTermo);
    }
}
