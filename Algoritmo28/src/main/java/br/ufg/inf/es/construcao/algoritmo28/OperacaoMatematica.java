package br.ufg.inf.es.construcao.algoritmo28;

import br.ufg.inf.es.construcao.algoritmo24.DivideSomas;
import br.ufg.inf.es.construcao.algoritmo4.Produto;

/**
 * Classe contendo método para operação matemática.
 */
public class OperacaoMatematica {
    public void realizaDivisao(int dividendo, int divisor, int k) {
        if (dividendo <= 0 || divisor <= 0) {
            throw new IllegalArgumentException("As entradas devem ser maiores "
                    + "que 0.");
        }
        
        DivideSomas divideSomas = new DivideSomas();
        Produto p = new Produto();
                
        int d = divideSomas.aplicaDivideSomas(dividendo, divisor);
        System.out.print(d);
        int r = dividendo % divisor;
        if (r != 0) {
            System.out.print(",");
        }
        while (r != 0 && k > 0) {            
            r = p.calculaProduto(10, r);
            d = divideSomas.aplicaDivideSomas(r, divisor);
            System.out.print(d);
            r = r % divisor;
            k -= 1;
        }
    }
}
