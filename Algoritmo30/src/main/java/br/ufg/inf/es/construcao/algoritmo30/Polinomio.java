package br.ufg.inf.es.construcao.algoritmo30;

import br.ufg.inf.es.construcao.algoritmo5.Potencia;

/**
 * Classe contendo método para cálculo de polinômios.
 */
public class Polinomio {
    
    /**
     * Calcula o polinômio 
     * @param x 
     * @param array
     * @return Inteiro correspondente ao polinômio
     */
    public int calculapolinomio(int x, int[] array) {
        int g = array.length;
        if (g < 1) {
            throw new IllegalArgumentException("O indice deve ser maior ou igual"
                    + " a 1.");
        }
        
        Potencia p = new Potencia();
        int potencia = p.calculaPotencia(x, g);
        int polinomio = 0;
        int contador = 1;
        while (contador <= (g - 1)) {            
            potencia = p.calculaPotencia(x, (contador - 1));
            polinomio += array[contador - 1] * potencia;
            contador += 1;
        }
        
        return polinomio;
    }
}
