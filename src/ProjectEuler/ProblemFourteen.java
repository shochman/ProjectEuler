package ProjectEuler;
import java.math.BigInteger;

public class ProblemFourteen {

	/**
	 * Scott Hochman
	 * 07/27/2013
	 * 
	 * The following iterative sequence is defined for the set of positive integers:
	 * 
	 * n -> n/2 (n is even)
	 * n -> 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following sequence:
	 * 
	 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 * 
	 * Which starting number, under one million, produces the longest chain?
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		int startingValWithLongestSequence = 0;
		int longestSequence = 0;
		for(int i=2 ; i < 1000000 ; i++) {
			int collatzSequenceLengthOfI = getCollatzSequenceLength(i);
			if(collatzSequenceLengthOfI > longestSequence) {
				longestSequence = collatzSequenceLengthOfI;
				startingValWithLongestSequence = i;
			}
		}
		System.out.println("Starting value with lengthiest Collatz sequence: " + startingValWithLongestSequence);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");

	}
	
	public static int getCollatzSequenceLength(int starting) {
		int counter = 1;
		BigInteger current = new BigInteger((starting + ""));
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		while(true) {
			if(current.mod(two).intValue() == 0)
				current = current.divide(two);
			else {
				current = current.multiply(three);
				current = current.add(one);
			}
			counter++;
			if(current.intValue() == 1)
				return counter;
		}
		
	}
}
