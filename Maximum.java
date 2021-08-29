package generics;

/*
 * this class will find maximum of 3 or 4 inputs of different type
 * it has a method maximum to find maximum
 * print method will print
 * it has 1 testcases
 * the user chooses the number of input
 */
public class Maximum<T extends Comparable<T>> {

	public T v;
	public T x;
	public T y;
	public T z;

	/*
	 * this is a constructor to initialize parameters
	 */
	Maximum(T v, T x, T y, T z) {
		this.v = v;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Maximum(T x, T y, T z) {

		this.x = x;
		this.y = y;
		this.z = z;
	}

	T max;

	/*
	 * this is a method to find maximum value out of 4 inputs. this method uses
	 * compareTo method to find maximum .initially first input value is assumed to
	 * be max and assigned to variable max. after comparing max with all other
	 * inputs max value is returned
	 */
	public T maximumofFour() {
		max = v;

		if ((max.compareTo(x)) < 0) {
			max = x;
		}
		if ((max.compareTo(y)) < 0) {
			max = y;
		}
		if ((max.compareTo(z)) < 0) {
			max = z;
		}
		printFour(v, x, y, z, max);
		return max;
	}

	/*
	 * this is a method to find maximum value out of 3 inputs. this method uses
	 * compareTo method to find maximum .initially first input value is assumed to
	 * be max and assigned to variable max. after comparing max with all other
	 * inputs max value is returned
	 */
	public T maximumofThree() {
		max = x;

		if ((max.compareTo(y)) < 0) {
			max = y;
		}
		if ((max.compareTo(z)) < 0) {
			max = z;
		}
		printThree(x, y, z, max);
		return max;
	}

	/*
	 * this method will print maximum of four values
	 */
	private void printFour(T v, T x, T y, T z, T max) {
		// TODO Auto-generated method stub
		System.out.printf("max of %s,%s,%s,%s is: %s\n", v,x,y,z, max);
	}

	/*
	 * this method will print maximum of three values
	 */
	private void printThree(T x, T y, T z, T max) {
		// TODO Auto-generated method stub
		System.out.printf("max of " + x + ", " + y + ", " + z + " is:" + max);
	}

}
