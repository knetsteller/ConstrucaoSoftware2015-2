package br.ufg.inf.es.construcao.algoritmo30;

import br.ufg.inf.es.construcao.algoritmo5.Potencia;

/**
 * Classe contendo método para cálculo de polinômios.
 */
public class Polinomio {
    
    /**
     * Calcula o polinômio 
     * @param literal Literal.
     * @param array Array dos elementos
     * @return Inteiro correspondente ao polinômio
     */
    public int calculapolinomio(int literal, int[] array) {
        int g = array.length;
        if (g <= 0) {
            throw new IllegalArgumentException("O indice deve ser maior ou igual"
                    + " a 1.");
        }
        
        Potencia p = new Potencia();
        int potencia = p.calculaPotencia(literal, g - 1);
        int polinomio = array[0];
        int contador = 0;
        while (contador <= (g - 1)) {            
            potencia = p.calculaPotencia(literal, (contador));
            polinomio += array[contador] * potencia;
            contador += 1;
        }
        
        return polinomio;
    }
}
