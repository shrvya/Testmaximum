package generics;

/*
 * this class will will find maximum of 3 numbers
 * it has a method maximum to find maximum
 * it has 3 testcases
 */
public class Maximum<Float extends Comparable<Float>> {

	public Float x;
	public Float y;
	public Float z;

	/*
	 * this is a constructor to initialize parameters
	 */
	Maximum(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Float max;

	/*
	 * this is a method to find maximum value out of 3 numbers of float type this method
	 * uses compareTo method to find maximum initially first number is assumed to be
	 * max and assigned to variable max after comparing max with all other numbers
	 * real max number is returned
	 */
	public Float maximum() {
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
