
package br.ufg.inf.es.construcao.algoritmo19;

/**
 *
 */
public class Logn {
    
    /**
     * Calcula 
     * @param n
     * @param k
     * @return 
     */
    public double calculaLogaritmo(double n, double k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1. "
                    + "k deve ser maior ou igual a 2.");
        }
        
        int contador = 2;
        double e = n + 1;
        double t = n;
        
        while (contador <= k) {            
            t = (t * n) / contador;
            e += t;
            contador += 1;
        }
        
        return e;
    }
}
