package br.ufg.inf.es.construcao.algoritmo6;

import br.ufg.inf.es.construcao.algoritmo4.Produto;

/**
 * Classe contendo método para calcular a soma das potências.
 */
public class PotenciaSoma {
    
    /**
     * Calcula a soma das potências 
     * @param base Base
     * @param expoente Expoente
     * @return Inteiro correspondente à base x elevada ao expoente y.
     */
    public int calculaPotencia(int base, int expoente) {
        if (base <= 0 || expoente < 1) {
            throw new IllegalArgumentException("x deve ser maior que 0 e y maior"
                    + " ou igual a 1.");
        }
        
        Produto produto = new Produto();
        int contador = 1;
        int potencia = base;
        while (contador < expoente) {            
            potencia = produto.calculaProduto(potencia, base);
            contador += 1;
        }
        
        return potencia;
    }
}
