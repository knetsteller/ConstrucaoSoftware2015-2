package br.ufg.inf.es.construcao.algoritmo5;

/**
 * Classe contendo método para cálculo de pontências.
 */
public class Potencia {
    
    /**
     * Calcula a potencia de uma base elevado a um expoente.
     * @param base Base
     * @param expoente Expoente
     * @return Base x elevada ao expoente y.
     */
    public int calculaPotencia(int base, int expoente) {
        if (base <= 0 || expoente < 0) {
            throw new IllegalArgumentException("A base deve ser maior que 0 e o "
                    + "expoente maior ou igual a 0.");
        }
        
        int contador = 1;
        int potencia = 1;        
        while (contador <= expoente) {            
            potencia *= base;
            contador += 1;
        }
        
        return potencia;
    }
}
