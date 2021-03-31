package Strings.interviews;

import java.util.StringTokenizer;

public class CountWordsInString 
{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("number of words: "+fastCounter("dfgdfgdfg"));

	}
	
	public static int fastCounter(String str)
	{
		StringTokenizer sToken = new StringTokenizer(str);
		
		return sToken.countTokens();
	}
	
	
	
	  public static int      countWords(String str)
    {
         
        // Check if the string is null
        // or empty then return zero
        if(str    == null || str.isEmpty())         return 0;
         
        int wordCount = 0;
         
        boolean isWord = false;
        int endOfLine = str.length() - 1;
         
        // Converting the given string
        // into a character array
        char[] ch = str.toCharArray();
         
        for (int i = 0; i < ch.length; i++)
        {             
           
            if (Character.isLetter(ch[i])  && i != endOfLine)
               
                isWord = true;
             
            // Check if the character is not a letter
            // that means there is a space, then we
            // increment the wordCount by one and set
            // the isWord by false
            else if (!Character.isLetter(ch[i])  && isWord) 
            {               
                wordCount++;
                isWord = false;
            }
             
            // Check for the last word of the
            // sentence and increment the wordCount
            // by one
            else if (Character.isLetter(ch[i])   && i == endOfLine)
                wordCount++;
        }
         
        // Return the total number of
        // words in the string
        return wordCount;
         
    }
	 
}
