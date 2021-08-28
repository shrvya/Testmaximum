package generics;

import generics.Maximum;

/*
 * this is test case 
 * max String is in third position
 * this will display String in third position as maximum
 */
public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Maximum<String> maxstring = new Maximum<>("Apple","Banana","Peach");
		
		System.out.println(maxstring.maximum());
	}

}

