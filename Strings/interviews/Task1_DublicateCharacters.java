package Strings.interviews;

import java.util.ArrayList;
import java.util.List;
public class Task1_DublicateCharacters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str = "find dublicates";
		
		List<Character> arChar = new ArrayList<Character>(); 
		
		
		for (int i=0; i<str.length();i++)
		{
			//System.out.println(str.charAt(i));
			for (int j=0; j<str.length();j++)
			{				
				if (i==j) {break;}
					
				if (  str.charAt(i) ==str.charAt(j) )  
				{		arChar.add(str.charAt(i)); break;		}				
			}//for j
			
		} //for i		
		System.out.println(arChar);	
	}
}