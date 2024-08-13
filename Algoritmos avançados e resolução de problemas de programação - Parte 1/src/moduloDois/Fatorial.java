package moduloDois;

import java.math.BigInteger;

public class Fatorial {
	
	 private static final int MAXIMO_ELEM = 10000;
	    private static final BigInteger[] elemFat = new BigInteger[MAXIMO_ELEM];

	    public static BigInteger fatEle(long numFatorial) {
	        for (int i = 0; i < MAXIMO_ELEM; i++) {
	            elemFat[i] = BigInteger.valueOf(-1);
	        }
	        return fatorialResult(numFatorial);
	    }

	    public static BigInteger fatorialResult(long numFatorial) {
	        if (numFatorial == 0) { // Fatorial de 0 é 1 (caso base)
	            return BigInteger.ONE;
	        }
	        BigInteger fat = BigInteger.ONE; // Acumulador para o fatorial
	        for (long i = 1; i <= numFatorial; i++) { // Loop itera até numFatorial
	            fat = fat.multiply(BigInteger.valueOf(i)); // Calcula fatorial multiplicando pelo iterador
	        }
	        return fat;
	    }
	
}
