package ProjectEuler;
import java.util.Arrays;


public class ProblemFiftyTwo {

	/**
	 * Scott Hochman
	 * 07/26/2013
	 * 
	 * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
	 * 
	 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		int currentInt = 1;
		while(true) {
			if(intToSortedString(currentInt).equals(intToSortedString(currentInt*2)) 
					&& intToSortedString(currentInt*2).equals(intToSortedString(currentInt*3))
					&& intToSortedString(currentInt*3).equals(intToSortedString(currentInt*4))
					&& intToSortedString(currentInt*4).equals(intToSortedString(currentInt*5))
					&& intToSortedString(currentInt*5).equals(intToSortedString(currentInt*6)) ) {
				break;
			}
			currentInt++;		
		}
		System.out.println("Smallest permuted multiple x: " + currentInt);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}

	public static String intToSortedString(int intToSort) {
		String intAsString = "" + intToSort;
		char[] chars = intAsString.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;
	}
}
