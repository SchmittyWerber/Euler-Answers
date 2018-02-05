package testerPack;
import java.math.BigInteger;

public class FactorialDigitSumB {

	//this method gives the factorial of a
	//given value
	public static String factorialOf(String s) {
		int z = Integer.valueOf(s);
		
		BigInteger facI = BigInteger.valueOf(z);
		
		for(int i= 100; i > 0; i--) {
			facI = facI.multiply(BigInteger.valueOf(i));
		}
	
		return s;
	}
	
	//this method finds the sum of the digits of 
	//given value
	public static int sumOf(int n) {
		//declaring the BigIntegers necessary to
		//calculate a large factorial
		BigInteger fac = BigInteger.valueOf(n);
		BigInteger sum = BigInteger.valueOf(0);
		//here we calculate the factorial for value n
		for(int i= 100; i > 0; i--) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		
		//here we find the individual digits of the 
		//factorial and add them together
        while (fac.compareTo(BigInteger.ZERO) > 0) {
        	sum = sum.add(fac.mod(BigInteger.TEN));
        	fac = fac.divide(BigInteger.TEN);     
        }
        
        //converts the BigInteger to an int
        int res = sum.intValue();
        
        //returns the converted int
        return res;
	} 
	
//----------------------------------------------------
	
	public static void main(String[] args) {
		int a = 100;
		
		//here we send our value to our
		//factorial method
		String toFac = Integer.toString(a);
		String asInt = factorialOf(toFac);
		
		//here we send our value to out
		//sum of all digits method
		int toSum = Integer.valueOf(asInt);
		int gotSum = sumOf(toSum);
		
		
		//passes a value to the sumOf object 
		//and prints the result
		System.out.println(gotSum);
	}
}
