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

		Maximum<Integer> maxint = new Maximum<>(100, 3000, 500);
		System.out.println("Maximum is");
		System.out.println(maxint.maximum());
	}

}
