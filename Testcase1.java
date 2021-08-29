package generics;

import java.util.Scanner;

import generics.Maximum;

/*
 * this is test case 
 * max String is in first position
 * this will display string in first position as maximum
 */
public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Enter the number of inputs (3 or 4)");
		
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		if(choice==3)
		{
			Maximum<String> maxstring = new Maximum<>("Apple","Banana","Kiwi");
			maxstring.maximumofThree();	
			Maximum<Integer> maxint = new Maximum<>(500,800,900);
			maxint.maximumofThree();	
		}
		if(choice==4)
		{
			Maximum<String> maxstring = new Maximum<>("Peach","Apple","Banana","Kiwi");
			maxstring.maximumofFour();	
			Maximum<Integer> maxint = new Maximum<>(500,800,900,1500);
			maxint.maximumofFour();	
		}
		
	}

}
