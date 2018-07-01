package testerPack;

public class DivisibleTriangularNumber {

	public static void main(String[] args) {
		long counter = 0;
		long largestCounter = 0;
		long largestChain = 0;
	
	
	for (long number = 999999; number >= 1; number--) {
		
		counter = 1;
		for (long n = number; n > 1; counter++) {
			if (n%2 == 0) n = n/2;
			else n = (3*n) + 1;
			
		}
		
		if (counter > largestCounter) {
			largestCounter = counter;
			largestChain = number;
		}
		
	}
	
	System.out.println("Number under 1 million with the longest sequence: " + largestChain);
	System.out.println("Length of sequence: " + largestCounter + " digits.");
	
	}
		
}
