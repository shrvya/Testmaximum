package generics;

/*
 * this class will will find maximum of 3 strings
 * it has a method maximum to find maximum
 * it has 3 testcases
 */
public class Maximum<String extends Comparable<String>> {

	public String x;
	public String y;
	public String z;

	/*
	 * this is a constructor to initialize parameters
	 */
	Maximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String max;

	/*
	 * this is a method to find maximum value out of 3 strings. this method uses
	 * compareTo method to find maximum .initially first string is assumed to be max
	 * and assigned to variable max. after comparing max with all other strings real
	 * max string is returned
	 */
	public String maximum() {
		max = x;

		if ((max.compareTo(y)) < 0) {
			max = y;
		}
		if ((max.compareTo(z)) < 0) {
			max = z;
		}
		print(x,y,z,max);
		return max;
	}
private void print(String x, String y, String z, String max) {
		// TODO Auto-generated method stub
		System.out.println("max of 3 strings "+x+" "+y+" "+z+" is:"+max);
	}

}
