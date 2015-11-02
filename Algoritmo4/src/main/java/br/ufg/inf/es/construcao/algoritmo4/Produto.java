
package br.ufg.inf.es.construcao.algoritmo4;

/**
 *
 * @author Netsteller
 */
public class Produto {
    public int calculaProduto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Os numeros devem ser maiores ou iguais a 0.");
        }
        
        int i = 1;
        int s = 0;
        
        while (i <= b) {            
            s += a;
            i += 1;
        }
        
        return s;
    }
}
