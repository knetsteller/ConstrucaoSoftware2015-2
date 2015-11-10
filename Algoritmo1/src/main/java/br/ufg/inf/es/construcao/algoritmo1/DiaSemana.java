/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Classe contendo método para cálculo do dia da semana.
 */
public class DiaSemana {
    
    /**
     * Calcula o dia da semana, dada uma data com dia, mês e ano.
     * @param dia O dia do mês
     * @param mes O mês do ano.
     * @param ano Ano.
     * @return Inteiro de 0 a 6, sendo 0 domingo e 6 sábado.
     */
    public int calculaDiaDaSemana(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Data inválida.");
        }
        
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Data inválida.");
        }
        
        if (ano < 1753) {
            throw new IllegalArgumentException("Data inválida.");
        }
        
        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;
        }
        int s = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400) + 1;
        
        return s % 7;
    }
}
