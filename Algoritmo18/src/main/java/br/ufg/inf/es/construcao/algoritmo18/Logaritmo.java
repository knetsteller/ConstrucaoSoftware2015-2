package br.ufg.inf.es.construcao.algoritmo18;

import br.ufg.inf.es.construcao.algoritmo16.Fatorial;
import br.ufg.inf.es.construcao.algoritmo5.Potencia;

/**
 * Classe contendo método para cálculo logaritmico.
 */
public class Logaritmo {
    public int calculaLogaritmo(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Entrada invalida.");
        }
        
        Fatorial f = new Fatorial();
        Potencia p = new Potencia();
        int contador = 2;
        int e = n + 1;
        int potencia;
        int fatorial;
        while (contador <= k) {            
            potencia = p.calculaPotencia(n, contador);
            fatorial = f.calculaFatorial(contador);
            e = e + potencia / fatorial;
            contador += 1;
        }
        
        return e;
    }
}
