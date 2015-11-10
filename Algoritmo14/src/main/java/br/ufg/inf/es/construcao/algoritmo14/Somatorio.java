package br.ufg.inf.es.construcao.algoritmo14;

/**
 * Classe contendo método para cálculo do inverso de n termos.
 */
public class Somatorio {
    
    /**
     * Calcula a soma dos inversos dos inteiros até n, fornecido como argumento.
     * @param n Inteiro cujo inverso da soma até ele deseja-se calcular.
     * @return Valor correspondente ao somatório dos inversos dos inteiros até n.
     */
    
    public double calculaSomatorio(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        double contador = 1;
        double somatorio = 0;
        double denominador;
        
        while (contador <= n) {            
            denominador = 1 + contador * contador;
            somatorio = somatorio + 1 / denominador;
            contador += 1;
        }
        
        return somatorio;
    }
}
