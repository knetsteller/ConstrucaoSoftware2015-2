/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.algoritmo1;

/**
 *
 * @author Netsteller
 */
public class DiaSemana {
    public int calculaDiaDaSemana(int dia, int mes, int ano) {
        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;
        }
        int s = dia + 2*mes + 3*(mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
        
        return s % 7;
    }
}
