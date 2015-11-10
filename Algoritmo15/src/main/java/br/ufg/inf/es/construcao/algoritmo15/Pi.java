package br.ufg.inf.es.construcao.algoritmo15;

/**
 * Classe contendo método para obtenção 
 */
public class Pi {
    public double calculaPi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("A entrada deve ser maior ou "
                    + "igual a 1.");
        }
        
        int contador = 1;
        double s = -1;
        double d = -1;
        double p = 0;
        while (contador <= n) {            
            d += 2;
            s = (-1) * s;
            p = p + ((4 * s) / d);
            contador += 1;
        }
        
        return p;
    }
}
