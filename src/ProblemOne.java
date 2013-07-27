
public class ProblemOne {

	/**
	 * Scott Hochman
	 * 07/24/2013
	 * 
	 * Problem:
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		int sum = 0;
		for(int i=1 ; i<1000 ; i++) {
			if( (i%3 == 0) || (i%5 == 0) ) {
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}
}
