
package br.ufg.inf.es.construcao.algoritmo12;

/**
 * Classe contendo método que calcula o máximo divisor comum entre os dois 
 * inteiros fornecidos.
 */
public class Mdc {
    
    /**
     * @param operandoUm Inteiro
     * @param operandoDois Inteiro
     * @return Inteiro correspondente ao máximo divisor comum entre a e b.
     */
    public int calculaMaximoDivisorComum(int operandoUm, int operandoDois) {
        if (operandoUm < operandoDois || operandoDois <= 0) {
            throw new IllegalArgumentException("O primeiro numero deve ser maior"
                    + " ou igual ao segundo. O segundo deve ser maior que 0.");
        }
        
        while (operandoUm != operandoDois) {            
            if (operandoUm > operandoDois) {
                operandoUm -= operandoDois;
            } else {
                operandoDois -= operandoUm;
            }
        }
        
        return operandoUm;
    }
}
