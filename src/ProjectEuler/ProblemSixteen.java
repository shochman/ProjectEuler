package ProjectEuler;
import java.math.BigInteger;

public class ProblemSixteen {

	/**
	 * Scott Hochman
	 * 07/26/2013
	 * 
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * What is the sum of the digits of the number 2^1000?
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		
		BigInteger two = new BigInteger("2");
		BigInteger exp = two.pow(1000);
		
		String bigNumber = exp.toString();
		int a = 0;
		int b = 1;
		int sum = 0;
		while(b <= bigNumber.length()) {
			sum += Integer.parseInt(bigNumber.substring(a, b));
			a++;
			b++;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}

}
