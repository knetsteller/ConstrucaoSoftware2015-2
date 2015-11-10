package br.ufg.inf.es.construcao.algoritmo41;

/**
 * Classe contendo método para operação em strings.
 */
public class Caractere {

    /**
     * Inverte a string fornecida como argumento, usando recursão.
     *
     * @param string String a ser convertida.
     * @return String invertida.
     */
    public String inverteCaracteres(String string) {
        if (string.equals("")) {
            throw new IllegalArgumentException("A string não pode ser vazia.");
        }
        
        String temporaria;
        String ultimoCaractere;
        if (string.length() == 1) {
            return string;
        } else {
            ultimoCaractere = string.substring(string.length()-1);
            temporaria = string.substring(0, string.length()-1);
            return ultimoCaractere + inverteCaracteres(temporaria);
        }
    }
}
