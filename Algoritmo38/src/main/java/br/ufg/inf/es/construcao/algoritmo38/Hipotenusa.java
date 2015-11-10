package br.ufg.inf.es.construcao.algoritmo38;

/**
 * Classe contendo método para cálculos com hipotenusa.
 */
public class Hipotenusa {
    
    /**
     * Calcula hipotenusa.
     * @param ladoOposto
     * @param ladoAdjacente
     * @return Valor correspondente à hipotenusa.
     */
    public double calculaHipotenusa(double ladoOposto, double ladoAdjacente) {
        if (ladoOposto < 1 || ladoAdjacente < 1) {
            throw new IllegalArgumentException("Os lados devem ser maiores "
                    + "que ou iguais a 1.");
        }
        
        double x = ladoOposto * ladoOposto;
        double y = ladoAdjacente * ladoAdjacente;
        double r = Math.sqrt(x + y);
        
        return r;
    }
}
