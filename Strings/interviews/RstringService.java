package Strings.interviews;

import java.util.Map;
import java.util.TreeMap;

import Strings.model.Rstring;

public class RstringService
{

	public static void main(String[] args) 
	{ 
		Rstring rstr =  generateString(); 
		System.out.println(rstr.getStr());
	}
	
	public static Rstring generateString() 
	{
		// TODO Auto-generated method stub
	   String genString = "";
	   Rstring rstr = new Rstring();
	   
		Map<Integer,Character> mapA = new TreeMap<Integer,Character>();
		mapA.put(0, 'a');
		mapA.put(1, 'b');
		mapA.put(2, 'c');
		mapA.put(3, 'd');
		mapA.put(4, 'e');
		mapA.put(5, 'f');
		mapA.put(6, 'g');
		mapA.put(7, 'h');
		mapA.put(8, 'i');
		mapA.put(9, 'j');
		mapA.put(10, 'k');
		mapA.put(11, 'l');
		mapA.put(12, 'm');
		mapA.put(13, 'n');
		mapA.put(14, 'o');
		mapA.put(15, 'p');
		mapA.put(16, 'q');
		mapA.put(17, 'r');
		mapA.put(18, 's');
		mapA.put(19, 't');
		mapA.put(20, 'u');
		mapA.put(21, 'v');
		mapA.put(22, 'w');
		mapA.put(23, 'x');
		mapA.put(24, 'y');
		mapA.put(25, 'z');
		mapA.put(26, ' ');
		mapA.put(27, ' ');
		mapA.put(28, ' ');
		mapA.put(29, ' ');
		mapA.put(30, ' ');
		
		int min = 0;
		int max = 30;
   
			

	   StringBuilder sb = new StringBuilder();
	  
	  try { 
	   for (int i=0;i<generateStringSize();i++)
	   {
		   sb.append(   mapA.get(  (int)Math.round((Math.random() * ((max - min) + 1)) + min)   )   ) ;
	   }
     
		//(Math.random() * ((max - min) + 1)) + min
		
	   rstr.setStr(sb.toString());
	  } catch (Exception e) {e.printStackTrace();}
		
		
		return rstr;
	}
	

 	
	private static int generateStringSize()
	{
		int min = 3;
		int max = 1000;
        int stringSize =  (int)Math.round((Math.random() * ((max - min) + 1)) + min)	;
      
        
		
		return stringSize;
	}
	
	


}