package generics;

import generics.Maximum;

/*
 * this is test case 
 * max number is in third position
 * this will display number in third position as maximum
 */
public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<Float> maxfloat = new Maximum<>(100.25f, 3000.26f, 5500.45f);
		System.out.println("Maximum is");
		System.out.println(maxfloat.maximum());
	}

}

