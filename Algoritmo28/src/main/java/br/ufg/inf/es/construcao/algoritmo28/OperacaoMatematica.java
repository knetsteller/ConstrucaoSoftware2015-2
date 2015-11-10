package br.ufg.inf.es.construcao.algoritmo28;

import br.ufg.inf.es.construcao.algoritmo24.DivideSomas;

/**
 * Classe contendo método para operação matemática.
 */
public class OperacaoMatematica {
    public double realizaDivisao(int a, int b, int k) {
        DivideSomas divideSomas = new DivideSomas();
                
        int d = divideSomas.aplicaDivideSomas(a, b);
        System.out.println(d);
        int r = a % b;
        if (r != 0) {
            System.out.println(",");
        }
        while (r != 0 && k > 0) {            
            r *= 10;
            d = divideSomas.aplicaDivideSomas(r, b);
            System.out.println(d);
            r = r % b;
            k -= 1;
        }
    }
}
