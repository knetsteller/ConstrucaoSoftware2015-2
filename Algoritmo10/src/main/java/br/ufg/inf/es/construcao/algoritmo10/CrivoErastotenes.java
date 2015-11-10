package br.ufg.inf.es.construcao.algoritmo10;

/**
 * Classe contendo método para cálculo de números primos.
 */
public class CrivoErastotenes {
    
    
    public void calculaCrivoEratostenes(int[] array, int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        int contador = 2;
        int c;
        while (contador <= (n / 2)) {            
            if (array[contador] == 0) {
                c = 2 * contador;
                while (c <= n) {                    
                    array[contador] = 1;
                    contador += 1;
                }
            }
            contador += 1;
        }
    }
}
