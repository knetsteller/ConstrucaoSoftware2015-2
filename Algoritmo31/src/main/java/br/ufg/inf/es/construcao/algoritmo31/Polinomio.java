package br.ufg.inf.es.construcao.algoritmo31;

/**
 * Classe contendo método para cálculo de polinômios.
 */
public class Polinomio {
    public int calculaEsquemaDeHorner(int x, int[] array) {
        int g = array.length;
        if (g < 1) {
            throw new IllegalArgumentException("arg");
        }
        
        int polinomio = array[0];
        int contador = g - 1;
        while (contador >= 0) {            
            polinomio = (polinomio * x) + array[contador - 1];
            contador -= 1;
        }
        
        return polinomio;
    }
}
