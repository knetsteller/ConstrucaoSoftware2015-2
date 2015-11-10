package br.ufg.inf.es.construcao.algoritmo37;

/**
 * Classe contendo método para função de Ackermann.
 */
public class Ackermann {
    
    /**
     * Realiza a função de Ackermann.
     * @param x
     * @param y
     * @return 
     */
    public int aplicaFuncaoDeAckermann(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("As entradas devem ser maiores que 0.");
        }
        
        if (x == 0) {
            return y + 1;
        }
        
        if (y == 0) {
            return aplicaFuncaoDeAckermann(x - 1, 1);
        }
        
        return aplicaFuncaoDeAckermann(x - 1, aplicaFuncaoDeAckermann(x, y - 1));
    }
}
