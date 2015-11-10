package br.ufg.inf.es.construcao.algoritmo11;

/**
 * Classe contendo método para cálculo do máximo divisor comum.
 */
public class Mdc {
    
    /**
     * Calcula o máximo divisor comum entre a e b.
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     * @return Inteiro correspondente ao mdc entre a e b.
     */
    public int calculaMaximoDivisorComum(int a, int b) {
        if (a < b || b <= 0) {
            throw new IllegalArgumentException("a deve ser maior ou igual b e b "
                    + "maior que 0.");
        }
        
        while (b != 0) {            
            int modulo = a % b;
            a = b;
            b = modulo;
        }
        
        return a;
    }
}
