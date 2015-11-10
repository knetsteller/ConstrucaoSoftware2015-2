package br.ufg.inf.es.construcao.algoritmo32;

/**
 * Classe contendo método para cálculo de Fibonacci.
 */
public class Fibonacci {
    
    /**
     * Realiza o cálculo de Fibonacci.
     * @param numero Inteiro a ser calculado.
     * @return Inteiro correspondente ao fibonacci de n.
     */
    public int calculaFibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("A entrada deve ser maior que 0.");
        }
        
        int valorAtual = 0;
        int fibonacci = 1;
        
        if (numero == 0 || numero == 1) {
            return numero;
        }
        
        int contador = 2;
        while (contador <= numero) {            
            int temporario = fibonacci;
            fibonacci += valorAtual;
            valorAtual = temporario;
            contador += 1;
        }
        
        return fibonacci;
    }
}
