package testerPack;

public class SummationOfPrimes {

	public static boolean isPrime(long input) {
        for (long i = 2; i < Math.sqrt(input)+1; i++) {
        	if (input == 2) return true;
        	else if (input % i == 0) return false;
        }
        return true;
    }
	
	public static long sumOfPrimes(long input) {
		long sumInput = 0;
		
		for (long i = input; i > 1; i--) {
			if (isPrime(i)) sumInput += i;			
		}
		return sumInput;
	}
	
	public static void main(String[] args) {
		long startPoint = 2000000;
		
		System.out.println(sumOfPrimes(startPoint));
	}
}
