package br.ufg.inf.es.construcao.algoritmo25;

/**
 * Classe contendo método que calcula a propriedade de divisão.
 */
public class DivideSubtracoes {
    
    /**
     * Exectuta operação de divisão de inteiros.
     * @param termoUm Primeiro termo.
     * @param termoDois Segundo termo.
     * @return Inteiro correspondente a quantidade de vezes que é possível 
     * realizar a operação de divisão sobre um inteiro.
     */
    public int calculaDivideSubtracoes(int termoUm, int termoDois) {
        if (termoUm < 0 || termoDois <= 0) {
            throw new IllegalArgumentException("x deve ser maior ou igual a 0 e y maior que zero.");
        }
        
        int contador = 0;
        int somatorio = termoUm;
        
        while (somatorio >= termoDois) {            
            somatorio -= termoDois;
            contador += 1;
        }
        
        return contador;
    }
}
