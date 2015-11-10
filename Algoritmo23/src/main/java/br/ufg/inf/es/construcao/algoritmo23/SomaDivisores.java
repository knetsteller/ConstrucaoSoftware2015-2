package br.ufg.inf.es.construcao.algoritmo23;

/**
 * Classe contendo método de operação matemática.
 */
public class SomaDivisores {
    
    /**
     * Calcula a soma dos divisores de n.
     * @param n Inteiro cujos divisores serão calculados.
     * @return Inteiro correspondente ao somatório dos divisores de n.
     */
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
