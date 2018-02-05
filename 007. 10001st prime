package testerPack;


public class BigPrime {

	public static boolean isPrime(long input) {
        for (int i = 2; i < Math.sqrt(input)+1; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }
		
	
	public static void main(String[] args) {
		long primeNum = 2;
		int primeCount = 1;
		int max = 10001;
		
		while (primeCount < max) {
			primeNum++;
			if (isPrime(primeNum) == true) primeCount++;
		}
		
		System.out.println(primeNum);
	}
}
