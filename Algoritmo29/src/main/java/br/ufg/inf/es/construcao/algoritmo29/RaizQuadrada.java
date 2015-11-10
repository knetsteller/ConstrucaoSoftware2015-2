package br.ufg.inf.es.construcao.algoritmo29;

/**
 *
 */
public class RaizQuadrada {
    public double calculaRaizQuadrada(int radicando) {
        if (radicando <= 0) {
            throw new IllegalArgumentException("O radicando deve ser maior que ");
        }
        
        double raizQuadrada = 1;
        int indice = 2;
        while (indice >= 0) {            
            raizQuadrada = (raizQuadrada + radicando / raizQuadrada) / 2;
            indice += 1;
        }
        
        return raizQuadrada;
    }
}
