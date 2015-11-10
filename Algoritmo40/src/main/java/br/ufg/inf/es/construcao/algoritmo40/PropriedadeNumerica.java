package br.ufg.inf.es.construcao.algoritmo40;

import br.ufg.inf.es.construcao.algoritmo16.Fatorial;

/**
 * Classe contendo método para propriedade fatorial.
 */
public class PropriedadeNumerica {
    
    /**
     * Método para verificar se o inteiro n atende a propriedade de ser igual
     * à soma dos três fatoriais.
     * @param n Inteiro a ser testado.
     * @return true se atende à propriedade e false, caso contrário.
     */
    public boolean verificaSomaFatores(int n) {
        int a = n / 100;
        int b = (n - 100 * 1) / 10;
        int c = n % 10;
        
        Fatorial fatorial = new Fatorial();
        int s = fatorial.calculaFatorial(a) + fatorial.calculaFatorial(b) +
                fatorial.calculaFatorial(c);
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }
}
