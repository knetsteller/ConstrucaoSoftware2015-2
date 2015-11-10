package br.ufg.inf.es.construcao.algoritmo22;

import br.ufg.inf.es.construcao.algoritmo23.SomaDivisores;

/**
 * Classe contendo método que verifica a aplicabilidade da propriedade amigos.
 */
public class Amigos {
    
    /**
     * Verifica se, tomados dois inteiros, eles são iguais a soma dos seus 
     * próprios divisores.
     * @param termoUm Primeiro inteiro.
     * @param termoDois Segundo inteiro.
     * @return true se a propriedade é válida e false, caso contrário.
     */
    public boolean verificaAmigos(int termoUm, int termoDois) {
        if (termoUm <= 0 || termoDois <= 0) {
            throw new IllegalArgumentException("n e m devem ser maiores que 0.");
        }
        
        SomaDivisores somaDivisores = new SomaDivisores();
        int somaDivisoresTermoUm = somaDivisores.aplicaSomaDivisores(termoUm);
        int somaDivisoresTermoDois = somaDivisores.aplicaSomaDivisores(termoDois);
        
        if (somaDivisoresTermoUm == termoUm && somaDivisoresTermoDois == termoDois) {
            return true;
        } else {
            return false;
        }
    }
}
