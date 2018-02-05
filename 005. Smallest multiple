package testerPack;

public class EulerSmallestMultiple {

	public static void main(String[] args) {
		//setting the initial values
		int numTest = 40;
		int counter = 20;
		int reset = counter;
		
		//checks for a remainder for each number descending
		//from 20 to 1. If a number gives a remainder the counter
		//will be reset
		while (counter > 0) {
			if (numTest % counter == 0) counter -= 1;
			else {
				numTest += 1;
				counter = reset;
			}
		}
		System.out.println(numTest);
	}
}
