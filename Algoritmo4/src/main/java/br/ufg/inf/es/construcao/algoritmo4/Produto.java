package br.ufg.inf.es.construcao.algoritmo4;

/**
 * Classe contendo método para cálculo do produto de dois inteiros.
 */
public class Produto {
    
    /**
     * Calcula o produto de dois inteiros fornecidos como argumento.
     * @param primeiroFator Primeiro fator da multiplicação.
     * @param segundoFator Segundo fator da multiplicação.
     * @return Inteiro correspondente à multiplicação do primeiro pelo segundo 
     * fator
     */
    public int calculaProduto(int primeiroFator, int segundoFator) {
        if (primeiroFator < 0 || segundoFator < 0) {
            throw new IllegalArgumentException("Os numeros devem ser maiores ou iguais a 0.");
        }
        
        int contador = 1;
        int somatorio = 0;
        
        while (contador <= segundoFator) {            
            somatorio += primeiroFator;
            contador += 1;
        }
        
        return somatorio;
    }
}
