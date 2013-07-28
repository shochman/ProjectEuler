package ProjectEuler;

public class ProblemFour {

	/**
	 * Scott Hochman
	 * 07/28/2013
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		int longPalindrome = 0;
		for(int i = 999 ; i > 99 ; --i) {
			for(int j = 999 ; j > 99 ; --j) {
				int current = i*j;
				if(isPalindrome(""+current) && (current > longPalindrome))
					longPalindrome = current;
			}
		}
		System.out.println("Longest palindrome made from the product of two 3-digit numbers: " + longPalindrome);
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}

	public static boolean isPalindrome(String s) {
		int n = s.length();
		for(int i=0 ; i < (n/2) ; ++i) {
			if(s.charAt(i) != s.charAt(n-i-1))
				return false;
		}
		return true;
	}
}
