package generics;

/*
 * this class will will find maximum of 3 numbers
 * it has a method maximum to find maximum
 * it has 3 testcases
 */
public class Maximum<Integer extends Comparable<Integer>> {

	public Integer x;
	public Integer y;
	public Integer z;

	/*
	 * this is a constructor to initialize parameters
	 */
	Maximum(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Integer max;

	/*
	 * this is a method to find maximum value out of 3 integer numbers this method
	 * uses compareTo method to find maximum initially first number is assumed to be
	 * max and assigned to variable max after comparing max with all other numbers
	 * real max number is returned
	 */
	public Integer maximum() {
		max = x;

		if ((max.compareTo(y)) < 0) {
			max = y;
		}
		if ((max.compareTo(z)) < 0) {
			max = z;
		}
		return max;
	}

}
