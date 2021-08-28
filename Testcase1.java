package generics;

import generics.Maximum;

/*
 * this is test case 
 * max number is in first position
 * this will display number in first position as maximum
 */
public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<Float> maxfloat = new Maximum<>(5500.02f, 3000.02f, 500.00f);
		System.out.println("Maximum is");
		System.out.println(maxfloat.maximum());
	}

}
