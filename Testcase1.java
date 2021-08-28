package generics;

import generics.Maximum;

/*
 * this is test case 
 * max String is in first position
 * this will display string in first position as maximum
 */
public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maximum<String> maxstring = new Maximum<>("Peach","Apple","Banana");
		
		System.out.println(maxstring.maximum());
	}

}
