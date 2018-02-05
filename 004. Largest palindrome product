package testerPack;

public class EulerLargestPalindrome {

	public static boolean isItPalindrome(int input) {
	    int rev = 0;                    
	    int inputAns = input;      
	    
	    while (inputAns > 0) {
	        rev = 10 * rev + inputAns % 10;
	        inputAns /= 10;
	    }
	    return input == rev;               
	}

	public static void main(String[] args) {

	    int largestKnown = 100001;

	    for ( int i = 999 ; i >= 100 ; i--) {
	        if (largestKnown >= i*999) break;

	        for (int n = 999 ; n >= i ; n--) {             
	            int boolIn = i * n;
	            if (largestKnown < boolIn && isItPalindrome(boolIn) == true) {
	            	largestKnown = boolIn;
	            }
	        }
	    }   
	    
	    System.out.println(largestKnown);
	    
	}
}
