package br.ufg.inf.es.construcao.algoritmo43;

import java.util.List;

/**
 * Classe contendo método para modificação de strings.
 */
public class Permuta {

    /**
     * Realiza a permutação com os caracteres da string forncecida.
     * @param prefixo Prefixo.
     * @param conjunto Caracteres concatenados atualmente.
     * @param resultadoParcial String com a string modificada atualmente
     * @return String permutada.
     */
    public List<String> realizaPermuta(String prefixo, String conjunto, List<String> resultadoParcial) {
  
        if (conjunto.length() == 1) {
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        }

        for (int i = 0; i < conjunto.length(); i++) {
            char cI = conjunto.charAt(i);

            StringBuilder sLinha = new StringBuilder(conjunto);
            sLinha.deleteCharAt(i);

            String pLinha = prefixo + cI;

            realizaPermuta(pLinha, sLinha.toString(), resultadoParcial);
        }

        return resultadoParcial;
    }
}
