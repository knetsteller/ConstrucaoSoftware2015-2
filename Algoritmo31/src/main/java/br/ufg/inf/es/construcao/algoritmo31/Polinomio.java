package br.ufg.inf.es.construcao.algoritmo31;

/**
 * Classe contendo método para cálculo de polinômios.
 */
public class Polinomio {
    
    /**
     * Calcula polinômio utilizando o Esquema de Horner.
     * @param literal Parte literal.
     * @param array Array de coeficientes.
     * @return Valor correspondente ao cálculo do polinômio.
     */
    public int calculaEsquemaDeHorner(int literal, int[] array) {
        int g = array.length;
        if (g < 1) {
            throw new IllegalArgumentException("Numero de coeficientes inválido.");
        }
        
        int polinomio = array[array.length - 1];
        int contador = g - 2;
        while (contador >= 0) {            
            polinomio = (polinomio * literal) + array[contador];
            contador -= 1;
        }
        
        return polinomio;
    }
}
