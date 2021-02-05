package Strings.O2_FirstNonRepeatCharacters;


public class Task2_FirstNotRepeatedCharacters {

	public static void main(String[] args) 
	{	System.out.println("First non-repeated char in String = "+ getFirstNotRepeatedChar(" aba baba  zfr"));	}
	
	public static char getFirstNotRepeatedChar(String str)
	{ 	
		char ch = ' ';
		
        for(Character charTemp:str.toCharArray()) 
        {
            if(str.indexOf(charTemp) == str.lastIndexOf(charTemp)) 
            {  ch = charTemp;
                break;
            }
        }
		
	return ch;
		
	}
}