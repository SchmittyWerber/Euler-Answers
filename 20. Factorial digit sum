package testerPack;

import java.math.BigInteger;

public class FactorialDigitSum {

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
	  
	  public static void main(String[] args) {
	    int a = 100;
	    System.out.println(sumOf(a));
	  }
	}
