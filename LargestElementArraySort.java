package practice.java.arrays;

import java.util.Arrays;

public class LargestElementArraySort {
	//Largest Element  and Second Largest element in an array using array sort.
	public static void main(String[] args) {
		int[] array  = {15,20,28,67,34};
		Arrays.sort(array);
		//Arrays is sorted out in the ascending order.
		//Printing the last element i.e the largest.
	    int largest = array[array.length-1];
	    int secondLargest = array[array.length-2];
	    System.out.println("The Largest Element in an array is : " +largest);
	    System.out.println("The Second Largest Element in an array is " +secondLargest);
	}

}
