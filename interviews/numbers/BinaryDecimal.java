package interviews.numbers;
/**
 Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, 
 take its binary representation (padded to the nearest N * 8 bits), 
 reverse that string of bits, and then finally return the new reversed string in decimal form.
 
  For example: if str is "47" then the binary version of this integer is 101111 but we pad it to be 00101111.
  Your program should reverse this binary string which then becomes: 11110100 and
   then finally return the decimal version of this string, which is 244
 */

import java.util.Scanner;
import java.util.Stack;

public class BinaryDecimal {

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		NumericChecker nc= new NumericChecker();
		boolean flag=false;
		String number="";
		
		do {
			System.out.println("Please enter decimal number");
		 number= sc.nextLine();
		//function for checking isNumber
		if(number.charAt(0)=='-')	
		  {System.out.println("Number is not positive");  flag= false;}
		    else {  //first symbol is not minus
		    	
		    	 if (nc.isNumeric(number)) //checking for number
		    	 {flag = true;}
		    	 else {flag=false;}
		    }
		} while (!flag);
		
		
		
		try 
		{	
			System.out.println(  BinaryReversal(number)  );
		}
		catch (Exception e)  
		{System.out.println("Error is "+e.getMessage() );
			e.printStackTrace();
		}
		
	
	}
	
	/**
	 * Short implementation 
	 * binary number convert to decimal
	 * @param str
	 * @return
	 */
	public static String BinaryReversal(String str) throws java.lang.NumberFormatException, Exception
	{	
		String bNumber = "";		
		bNumber = DecimaLToBinary(str);
		
		if (bNumber.length()<9) 
		{   int bit = 8-bNumber.length();
		    for (int i=0;i<bit;i++)
		    {
		    	bNumber="0"+bNumber;
		    }
		}
		StringBuilder sb = new StringBuilder(bNumber);
		sb.reverse();
		
		return BinaryToDecimal(sb.toString());
	}
	
	
	/**
	 * Short implementation 
	 * binary number convert to decimal
	 * @param str
	 * @return
	 */
	public static String DecimaLToBinary(int decimalNumber) throws java.lang.NumberFormatException, Exception
	{
		return Long.toBinaryString(decimalNumber);
	}
	
	/**
	 *detail implementation 
	 * binary number convert to decimal
	 * @param str
	 * @return
	 */
	public static String DecimaLToBinary(String decimalNumber) throws java.lang.NumberFormatException, Exception
	{
	Stack<Integer> stack = new Stack<Integer>();
	int num = Integer.parseInt(decimalNumber);
	String binNumber = "";	
	
	while (num != 0)
		    {
		      int d = num % 2;
		      stack.push(d);
		      num /= 2;
		    } 
		
		    while (!(stack.isEmpty() ))
		    {
		    	binNumber+=stack.pop();
		    }		  
		    
		    return 	binNumber;
	} // end method
	
	
	/**
	 * method convert Binary to Decimal
	 * @param binaryNumber
	 * @return
	 */
	 public static String BinaryToDecimal(int binaryNumber)  throws java.lang.NumberFormatException, Exception
	 { String bNumber = String.valueOf(binaryNumber);
		 return  ""+Integer.parseInt(bNumber  ,2);
	 }
	 
	 /**
		 * method convert Binary to Decimal
		 * @param binaryNumber
		 * @return
		 */
	 public static String BinaryToDecimal(String binaryNumber1) throws java.lang.NumberFormatException, Exception
	 {
		 int binaryNumber = Integer.valueOf(binaryNumber1);
		 
		    int decimal = 0;
		    int p = 0;
		    while(true){
		      if(binaryNumber == 0){
		        break;
		      } else {
		          int temp = binaryNumber%10;
		          decimal += temp*Math.pow(2, p);
		          binaryNumber = binaryNumber/10;
		          p++;
		       }
		    }
		    return ""+decimal;
	}
	 

}


class NumericChecker 
{
	String s="";
  
	 public static boolean isNumeric(String s) 
	 {
        if (s == null || s.equals("")) {
            return false;
        }
 
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9') 
            {
                return false;
            }
        }
        return true;
    }

	 public static boolean isNumeric1(String s) {
	        if (s == null || s.equals("")) {
	            return false;
	        }
	 
	        return s.chars().allMatch(Character::isDigit);
	    }
	 
	 
	 public static boolean isNumeric2(String s) 
	 {
		 return (s != null && s.matches("[0-9]+"));
	 }
	 
	 
	 public static boolean isNumeric3(String s) {
	        try {
	            Integer.parseInt(s);
	        } catch (NumberFormatException ex) {
	            return false;
	        }
	        return true;
	    }
	 
}


