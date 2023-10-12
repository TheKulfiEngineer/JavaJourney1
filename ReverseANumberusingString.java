package practice.java;

import java.util.Scanner;

public class ReverseANumberusingString {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder str = new StringBuilder(String.valueOf(num));
		String reverse = str.reverse().toString();
		int reversed  = Integer.valueOf(reverse);
		System.out.println("The reversed Number is : ");
		System.out.println(reversed);
	}

} 
