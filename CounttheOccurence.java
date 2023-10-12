package practice.java.strings;

import java.util.Scanner;

public class CounttheOccurence {
	//Count the no of occurrence of each word in the given string 
	public static void main(String[] args) {
		int count = 0 ;
		String str = "Happy World is a Happy World";
	    String input = "Happy";
	    String words[] = str.split(" ");
	    for(int i = 0 ; i < words.length ; i++) {
	    	if(input.equals(words[i]))
	    	{
	    		count++;
	    	}
	    }
		System.out.println("The Word " +input +" Occures " +count +" times");
	}

}
