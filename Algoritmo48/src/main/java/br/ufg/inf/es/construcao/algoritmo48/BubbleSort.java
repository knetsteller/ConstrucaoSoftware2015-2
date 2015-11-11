package br.ufg.inf.es.construcao.algoritmo48;

/**
 * Classe contendo o método de ordenação bubblesort.
 */
public class BubbleSort {
    static int[] array;
    /**
     * Realiza ordenação dos elementos por bubblesort.
     * @param a Array a ser ordenado.
     * @param n
     * @return Array com os elementos ordenados de forma crescente.
     */
    public static int[] ordenaArrayPorBubbleSort(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n dever maior ou igual a 0.");
        }
        
        array = a;
        int p = a.length - 1;        
        while (p >= 1) {            
            int indice = 0;
            while (indice < p) {                
                if (array[indice] > array[indice + 1]) {
                    int elementoTemporario = array[indice];
                    array[indice] = array[indice + 1];
                    array[indice + 1] = elementoTemporario;
                }                
                indice += 1;
            }            
            p -= 1;
        }
        
        return array;
    }
}
