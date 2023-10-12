package practice.java;

import java.util.Scanner;

//To print the prime numbers within the range (say 1  to 100)
public class PrintPrimeNumbersRange {
	public static boolean Prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i =2 ; i<=n/2 ; i++)
			if(n%i == 0) {
				return false;
			}
		return true;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the Starting Range");
		Scanner sc = new Scanner (System.in);
		int start = sc.nextInt();
		System.out.println("Enter the Ending Range");
		int end  = sc.nextInt();
		int count = 0 ; 
		for(int i = start ; i<=end ;i++)
		{
			if(Prime(i))
			{
				System.out.println("The number " +i+ " is Prime");
				count++;
			}
		}
		System.out.println("The NUmber of Prime Numbers is : " +count);
		
		
	}

}
