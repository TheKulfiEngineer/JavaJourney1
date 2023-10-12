package practice.java;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static boolean isPrime(int n)
	{
		if(n<2) {
			return false;
		}
		for(int i = 2 ; i<=n/2 ;i++)
			if(n%i == 0)
			{
				return false;
			}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println("The given number "+num +" is a prime number");
		}
		else
		{
			System.out.println("The given number "+num +" is not a prime number");
		}
		
	}

}
