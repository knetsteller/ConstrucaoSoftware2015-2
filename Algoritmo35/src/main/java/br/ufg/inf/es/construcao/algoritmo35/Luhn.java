package br.ufg.inf.es.construcao.algoritmo35;

/**
 * Classe contendo método para validação.
 */
public class Luhn {
    public int verificaPorAlgoritmoLuhn(int[] array) {
        int digitosPares = 0;
        int digitosImpares = 0;
        int indice = array[(array.length) - 1];
        boolean a = false;
        while (indice > 0) {            
            if (a) {
                digitosPares += array[indice];                
            } else {
                int t = array[indice] * 2;
                digitosImpares = digitosImpares + Math.floorDiv(t, 10) + t % 10;
            }
            indice -= 1;
            a = !a;
        }
        
        return 10 - ((digitosImpares + digitosPares) % 10);
    }
}
