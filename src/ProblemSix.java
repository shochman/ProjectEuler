
public class ProblemSix {

	/**
	 * Scott Hochman
	 * 07/25/2013
	 * The sum of the squares of the first ten natural numbers is,
     * 
     * 385
     * The square of the sum of the first ten natural numbers is,
     * 
     * 3025
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
     * 
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for(int i=1 ; i<=100 ; i++) {
			sumOfSquares += (i*i);
			squareOfSum += i;
		}
		squareOfSum *= squareOfSum;
		int difference = squareOfSum - sumOfSquares;
		System.out.println("Difference is: " + difference);
	}

}
