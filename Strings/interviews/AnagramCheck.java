package Strings.interviews;

import java.util.Arrays;

/**
 * 
 * 
 * 
 * 
 * @author MrDzen
 *
 */

public class AnagramCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	
	
	
	public static boolean iAnagram(String word, String anagram)
	{ 
	char[] charFromWord = word.toCharArray(); 
	char[] charFromAnagram = anagram.toCharArray();
	Arrays.sort(charFromWord); 
	Arrays.sort(charFromAnagram); 
	
	return Arrays.equals(charFromWord, charFromAnagram); 
	}

	//Read more: https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz6pKBy8yxZ

}
