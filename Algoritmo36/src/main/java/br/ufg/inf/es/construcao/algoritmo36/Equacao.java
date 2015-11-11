package br.ufg.inf.es.construcao.algoritmo36;

/**
 * Classe contendo método para cálculo de equações.
 */
public class Equacao {
    public int resolveEquacao() {
        int somatorio = 0;
        int icognitaX = 0;
        int icognitaY = 0;
        int icognitaZ = 0;
        int icognitaW = 0;
        while (icognitaX <= 96) {            
            icognitaY = 1;
            while (icognitaY <= 65) {                
                icognitaZ = 1;
                while (icognitaZ <= 39) {                    
                    icognitaW = 1;
                    while (icognitaW <= 28) {                        
                        if (2 * icognitaX + 3 * icognitaY + 5 * icognitaZ 
                            + 7 * icognitaW == 210) {
                            somatorio += 1;
                        }
                        icognitaW += 1;
                    }
                    icognitaZ += 1;
                }
                icognitaY += 1;
            }
            icognitaX += 1;
        }
        
        return somatorio;
    }
}
