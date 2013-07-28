package ProjectEuler;

public class ProblemFifteen {

	/**
	 * Scott Hochman
	 * 07/28/2013
	 * 
	 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
	 * 
	 * How many such routes are there through a 20×20 grid?
	 */
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println("Ways to traverse a 20x20 grid: " + nChooseK(40,20));
		System.out.println("Completed in " + (System.currentTimeMillis() - now) + " ms.");
	}

	public static long nChooseK(int n, int k) {
		if(k > (n-k))
			k = (n-k);
		long ret = 1;
		
		for(int i=0 ; i < k ; ++i) {
			ret *= (n-i);
			ret /= (i+1);
		}
		return ret;
	}
}
