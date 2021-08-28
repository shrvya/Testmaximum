package generics;

import generics.Maximum;

/*
 * this is test case for float type
 * max value is in third position
 * this will display value in third position as maximum
 */
public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<Float> maxfloat = new Maximum<>(502.02f, 550.23f, 800.26f);

		System.out.println(maxfloat.maximum());
	}

}
