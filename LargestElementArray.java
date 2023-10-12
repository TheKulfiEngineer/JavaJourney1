package practice.java.arrays;

import java.util.Scanner;

public class LargestElementArray {
	//Largest Element in an Array using normal method.
	public static void main(String[] args) {
		int [] array = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements : ");
		for(int i = 0 ; i<5 ; i++)
		{
			array[i] = sc.nextInt();
		}
		int largest = 0 ;
		for(int j =0 ; j<5 ; j++)
		{
			if(largest <= array[j])
			{
				largest = array[j];
			}
		}
		System.out.println("The Largest Number is :" +largest);
		
	}

}
