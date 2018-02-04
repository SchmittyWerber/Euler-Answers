package testerPack;

public class eulerLargestPrimeFactor {

//===========================================================================
	
	//takes the sqrt of the given variable
	public static double sqrt(double input) {

		double d;
			 
		double sqrt = input / 2;
				
			do {
				d = sqrt;
				sqrt = (d + (input / d)) / 2;
			} while ((d - sqrt) != 0);
				
		return sqrt;
	}
		
	
//===========================================================================
	
	//will return an answer after determining if the variable is prime
	public static boolean isPrime(Double dub) {
		
		boolean result = false;
		
		for (double i = 2; i <= eulerLargestPrimeFactor.sqrt(dub); i++) {
			if (dub % i == 0) { 
				result = false;
				i = dub;
			}
			else {
				result = true;
			}
		}
		
		return result;
	}

//===========================================================================

	public static void main(String[] args) {
		double numberA = 600851475143L;
		//converts the double from the sqrt calculator into an int by rounding down
		//this makes it easier to plug into the for method
		int roundedPrime = (int) Math.rint(eulerLargestPrimeFactor.sqrt(numberA));
		
		//we count down from the largest whole numbers that could be a factor of numberA
		//if a number leaves no remainder when dividing into whole #s we consider it a factor
		//that factor is plugged into our isPrime boolean to determine if it is prime
		for (double i = roundedPrime; i > 1; i--) {
			if (numberA % i == 0 && eulerLargestPrimeFactor.isPrime(i) == true) {
				System.out.println(i);
				i = 1;
			}
		}
	}
}

		
