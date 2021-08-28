package generics;

import generics.Maximum;

/*
 * this is test case for integer values
 * max value first position
 * this will display value in first position as maximum
 */
public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<Integer> maxint = new Maximum<>(500, 300, 200);

		System.out.println(maxint.maximum());
	}

}
