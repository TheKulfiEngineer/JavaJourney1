package practice.java;

import java.util.Scanner;

public class ReverseANumber {
	//Reverse the given number;
	static int sum = 0 ;
	public static int reverse(int num)
	{
		int rev = 0 ;
		while(num>0) {
			rev = num%10;
			sum = rev + sum*10;
			num = num/10;
		}
		System.out.println("The Reversed Number is " +sum);
		return sum;
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		reverse(number);
		System.out.println(sum);
		
	}

}
