package br.ufg.inf.es.construcao.algoritmo27;

/**
 * Classe contendo método para a operação de módulo.
 */
public class Modulo {
    
    /**
     * Executa a operação módulo sobre o primeiro termo.
     * @param x Termo a se aplicar módulo.
     * @param y Termo cujo valor se aplica o módulo.
     * @return Inteiro correspondente à operação.
     */
    public int calculaModulo(int x, int y) {
        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("As entradas devem ser maiores "
                    + "que zero.");
        }
        
        int somatorio = x;
        
        while (somatorio >= y) {            
            somatorio -= y;
        }
        
        return somatorio;
    }
}
