package generics;

import generics.Maximum;

/*
 * this is test case 
 * max number is in second position
 * this will display number in second position as maximum
 */
public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<Float> maxfloat = new Maximum<>(100.25f, 3000.25f, 500.26f);
		System.out.println("Maximum is");
		System.out.println(maxfloat.maximum());
	}

}
