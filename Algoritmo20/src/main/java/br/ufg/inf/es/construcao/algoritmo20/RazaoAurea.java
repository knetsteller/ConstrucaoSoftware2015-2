package br.ufg.inf.es.construcao.algoritmo20;

/**
 * Classe contendo método para calcular razão áurea.
 */
public class RazaoAurea {
    
    /**
     * Calcula razao aurea.
     * @param termoUm Primeiro termo.
     * @param termoDois Segundo termo.
     * @param fator Fator.
     * @return Valor correspondente a razão áurea.
     */
    public double calculaRazaoAurea(double termoUm, double termoDois, double fator) {
        if (termoUm <= 0 || termoDois <= termoUm || fator <= 0) {
            throw new IllegalArgumentException("termoUm deve ser maior que 0."
                    + "termoDois deve ser maior termoUm."
                    + "fator deve ser maior que 0.");
        }
        
        double tc = termoDois;
        double ta = termoUm;
        int contador = 1;
        
        while (contador <= fator) {            
            tc += ta;
            ta = tc - ta;
            contador += 1;
        }
        
        return tc / ta;
    }
}
