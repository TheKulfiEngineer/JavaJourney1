package practice.java.strings;

public class ReverseEachwordsinaSentence {
	//Reverse each word in a Sentence.
	//Example : How are you -----> you are How 
	public static String reverse(String str) {
		String[] words = str.split(" ");
		String result = "";
		for(int i = words.length-1 ; i>=0 ;i--)
		{
			if(i==0)
			{
				result = result + words[i];
			}
			else
			{
				result = result + words[i] + " ";
			}
		}
		return result;
		
	}
	public static void main(String[] args) { 
		String input = "This is a beautiful World ";
		System.out.println(reverse(input));
		
		
		
	}

}
