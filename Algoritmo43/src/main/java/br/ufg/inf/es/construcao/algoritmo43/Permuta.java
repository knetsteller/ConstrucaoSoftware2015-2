package br.ufg.inf.es.construcao.algoritmo43;

/**
 * Classe contendo método para modificação de strings.
 */
public class Permuta {
    public String realizaPermuta(String prefixo, String string) {
        String temporaria;
        String prefixoTemporario;
        String ultimoCaractere;
        String permutada = "";
        
        if (string.length() == 1) {
            permutada = prefixo + string;
        } else {
            for (int i = 0; i < string.length(); i++) {
                ultimoCaractere = string.substring(string.length() - 1);
                temporaria = string.substring(0, (string.length() - 1));
                prefixoTemporario = prefixo + ultimoCaractere;
                realizaPermuta(prefixoTemporario, temporaria);
            }
        }
        
        return permutada;
    }
}
