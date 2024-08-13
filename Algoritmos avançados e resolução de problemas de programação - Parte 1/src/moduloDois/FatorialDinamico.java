package moduloDois;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FatorialDinamico {

    // Abordagem Top-Down com Memoização
    private static final Map<Long, BigInteger> cacheTopDown = new HashMap<>();

    public static BigInteger fatorialTopDown(long numFatorial) {
        if (numFatorial == 0) {
            return BigInteger.ONE;
        }
        if (cacheTopDown.containsKey(numFatorial)) {
            return cacheTopDown.get(numFatorial);
        } else {
            BigInteger resultado = BigInteger.valueOf(numFatorial).multiply(fatorialTopDown(numFatorial - 1));
            cacheTopDown.put(numFatorial, resultado);
            return resultado;
        }
    }

    // Abordagem Bottom-Up
    public static BigInteger fatorialBottomUp(long numFatorial) {
        BigInteger[] tabela = new BigInteger[(int) numFatorial + 1];
        tabela[0] = BigInteger.ONE;
        for (int i = 1; i <= numFatorial; i++) {
            tabela[i] = BigInteger.valueOf(i).multiply(tabela[i - 1]);
        }
        return tabela[(int) numFatorial];
    }

    public static void main(String[] args) {
        long numero = 7;

        // Fatorial com abordagem Top-Down
        System.out.println("Fatorial de " + numero + " (Top-Down): " + fatorialTopDown(numero));

        // Fatorial com abordagem Bottom-Up
        System.out.println("Fatorial de " + numero + " (Bottom-Up): " + fatorialBottomUp(numero));

        // Comparando para um número grande
        long numeroGrande = 100;
        System.out.println("Fatorial de " + numeroGrande + " (Top-Down): " + fatorialTopDown(numeroGrande));
        System.out.println("Fatorial de " + numeroGrande + " (Bottom-Up): " + fatorialBottomUp(numeroGrande));
    }
}
