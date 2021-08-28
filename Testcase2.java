package generics;

import generics.Maximum;

/*
 * this is test case 
 * max String is in second position
 * this will display String in second position as maximum
 */
public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Maximum<String> maxstring = new Maximum<>("Apple","Peach","Banana");
		
		System.out.println(maxstring.maximum());
	}

}
