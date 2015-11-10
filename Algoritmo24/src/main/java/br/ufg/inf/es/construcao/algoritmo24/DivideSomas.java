package br.ufg.inf.es.construcao.algoritmo24;

/**
 * Classe contendo método de divisão.
 */
public class DivideSomas {

    /**
     * Calcula a divisão de um inteiro por outro.
     * @param termoUm
     * @param termoDois
     * @return Inteiro correspondente a divisão de um inteiro por outro.
     */
    public int aplicaDivideSomas(int termoUm, int termoDois) {
        if (termoUm < 0 || termoDois <= 0) {
            throw new IllegalArgumentException("x deve ser maior ou igual a 0 e y maior que 0.");
        }

        int contador = 0;
        int somatorio = termoDois;
        while (somatorio <= termoUm) {
            somatorio += termoDois;
            contador += 1;
        }

        return contador;
    }
}
