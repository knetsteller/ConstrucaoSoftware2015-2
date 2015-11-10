package br.ufg.inf.es.construcao.algoritmo45;

/**
 * Classe contendo método para aplicações em arrays.
 */
public class Array {
    
    /**
     * Método para impressão dos elementos do array fornecido.
     * @param array Array de elementos.
     * @param numeroElementos Número de elementos a serem impressos.
     */
    public void imprimeArray(int[] array, int numeroElementos) {
        if (numeroElementos < 0) {
            throw new IllegalArgumentException("O número de elementos deve ser "
                    + "maior ou igual a 0.");
        }
        
        int contador = 1;
        while (contador <= numeroElementos) {            
            System.out.println(array[contador]);
            contador += 1;
        }
    }
}
