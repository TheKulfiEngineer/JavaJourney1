package practice.java.strings;

public class StringCaseConversion {
  // Convert the upper case characters to lower case and vice versa.
	public static void reverseCharcters(StringBuffer str)
	{
		int length = str.length();
		for(int i = 0 ; i<length;i++) {
			Character ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				str.setCharAt(i , Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch))
			{
			 str.setCharAt(i , Character.toUpperCase(ch));
			}
			else {
			   str.setCharAt(i,ch);
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		StringBuffer input =  new StringBuffer("Hello World");
		reverseCharcters(input);
		
	}
	

}
