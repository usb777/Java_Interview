package Strings.O4_SubstringInString;

import java.util.Scanner;

public class Task4_String_and_Substring 
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Please, enter String");
		String str = sc.nextLine();
		
		System.out.println("Please, enter SubString");
		String subStr = sc.nextLine();
		
		
		if (str.contains(subStr))  {System.out.println(str +" contains "+subStr);}
		else  {System.out.println(str +" doesn't contain "+subStr);}
	}
	
	
}
