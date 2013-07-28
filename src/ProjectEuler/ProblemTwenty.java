package ProjectEuler;
import java.math.BigInteger;


public class ProblemTwenty {

	/**
	 * Scott Hochman
	 * 07/28/2013
	 * 
	 * n! means n × (n − 1) × ... × 3 × 2 × 1
	 * 
	 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
	 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		BigInteger factorial = BigInteger.ONE;
		BigInteger integer = BigInteger.ONE;
		for(int i = 1; i <= 100 ; i++) {
			factorial = factorial.multiply(integer);
			integer = integer.add(BigInteger.ONE);
		}
		String bigIntInString = factorial.toString();
		System.out.println(bigIntInString);
		
		//Took this section of code from what I previously wrote in ProblemSixteen
		int a = 0;
		int b = 1;
		int sum = 0;
		while(b <= bigIntInString.length()) {
			sum += Integer.parseInt(bigIntInString.substring(a, b));
			a++;
			b++;
		}
		System.out.println("Sum of the digits in 100!: " + sum);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}
}
