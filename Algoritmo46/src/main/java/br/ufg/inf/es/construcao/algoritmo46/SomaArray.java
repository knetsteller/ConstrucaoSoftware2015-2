package br.ufg.inf.es.construcao.algoritmo46;

/**
 * Classe contendo método para soma dos elementos de um array.
 */
public class SomaArray {
    
    /**
     * Calcula a soma dos elementos do array fornecido.
     * @param array Array cujos elementos serão somados.
     * @param n
     * @return Inteiro correspondente ao valor da soma dos n elementos.
     */
    public int somaValoresDoArray(int array[], int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        int somatorio = 0;
        int contador = 0;        
        while (contador <= (n - 1)) {            
            somatorio += array[contador];
            contador += 1;
        }
        
        return somatorio;
    }
}
