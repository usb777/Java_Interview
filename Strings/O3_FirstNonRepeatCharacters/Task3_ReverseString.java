package Strings.O3_FirstNonRepeatCharacters;



public class Task3_ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(getReverseString("Hello coders!"));
	}
	
	public static String getReverseString(String str) 
	{
	  String newString = new String("");
		for (int i=str.length()-1;i>=0;i--) 
		{
			//System.out.println(str.charAt(i)) ;
			newString += str.charAt(i);
		}
		return newString;
	}
}
