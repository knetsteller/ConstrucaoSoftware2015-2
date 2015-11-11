package br.ufg.inf.es.construcao.algoritmo10;

/**
 * Classe contendo método para cálculo de números primos.
 */
public class CrivoErastotenes {
    
    
    public void calculaCrivoEratostenes(int[] array, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        if (array.length < (n + 1)) {
            throw new IllegalArgumentException("Array com tamanho inválido.");
        }
        
        for (int i = 2; i < n; i++) {
            if (array[i] != 0) {
                throw new IllegalArgumentException("arg");                
            }
        }
        
        int contador = 2;
        int c = 0;
        while (contador <= (n / 2)) {            
            if (array[contador] == 0) {
                c = 2 * contador;
                while (c <= n) {                    
                    array[contador] = 1;
                    c += 1;
                }
            }
            contador += 1;
        }
    }
}
