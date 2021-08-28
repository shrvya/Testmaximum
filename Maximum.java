package generics;

/*
 * this class will will find maximum of 3 inputs of different type
 * it has a method maximum to find maximum
 * print method will print
 * it has 3 testcases
 */
public class Maximum<T extends Comparable<T>> {

	public T x;
	public T y;
	public T z;

	/*
	 * this is a constructor to initialize parameters
	 */
	Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	T max;

	/*
	 * this is a method to find maximum value out of 3 inputs. this method uses
	 * compareTo method to find maximum .initially first input value is assumed to
	 * be max and assigned to variable max. after comparing max with all other
	 * inputs max value is returned
	 */
	public T maximum() {
		max = x;

		if ((max.compareTo(y)) < 0) {
			max = y;
		}
		if ((max.compareTo(z)) < 0) {
			max = z;
		}
		print(x, y, z, max);
		return max;
	}

	/*
	 * this method will print max value
	 */
	private void print(T x, T y, T z, T max) {
		// TODO Auto-generated method stub
		System.out.println("max of " + x + " " + y + " " + z + " is:" + max);
	}

}
