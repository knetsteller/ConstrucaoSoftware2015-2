package br.ufg.inf.es.construcao.algoritmo23;

/**
 *
 */
public class SomaDivisores {
    
    public int aplicaSomaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n deve ser maior que 0.");
        }
        
        int d = 2;
        int s = 1;        
        while (d <= Math.floorDiv(n, 2)) {            
            if ((n % d) == 0) {
                s += d;
            }
            
            d += 1;
        }
        
        return s;
    }
}
