package Strings;

import java.util.ArrayList;
import java.util.List;

public class StrigContainer 
{
	
	
	
	public static void commonSubstring(String[] a, String[] b)
	{
		String answer = "NO";
		boolean flag = false;
		
		for (int i=0;i<a.length; i++) //
		{
			
			for (int j=0;j<a[i].length();j++) // output all letters of word
			{
				 System.out.println(b[i].charAt(j));
					if (b[i].contains(""+a[i].charAt(j)) ) 
					   {  
						System.out.println("YES"); break;
					   } //if
					else 
					{
						System.out.println("NO"); break; 
					} //else
				
			} //for j 
			
			
		}//for i
		
		
		
		//return answer;
	}
	
	
	
	public static void commonSubstring(List<String> a, List<String> b)
	{
		String answer = "NO";
		boolean flag = false;
		
		for (int i=0;i<a.size(); i++) //
		{
			
			for (int j=0;j<a.get(i).length();j++) // output all letters of word
			{
				 System.out.println(b.get(i).charAt(j));
					if (b.get(i).contains(""+a.get(i).charAt(j)) ) 
					   {  
						System.out.println("YES"); break;
					   } //if
					else 
					{
						System.out.println("NO"); break; 
					} //else
				
			} //for j 
			
			
		}//for i
		
		
		
		//return answer;
	}
	
	
	public static void main(String[] args)
	{
		String[] a1 = {"ab","cd","ef"};		
		String[] b1 = {"af","ee","aa"};
		
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		
		a.add("ab");
		a.add("cd");
		a.add("ef");
		
		b.add("af");
		b.add("ee");
		b.add("aa");
		
		
		commonSubstring(a,b);

	}

}
