package Strings.interviews;

public class StringSplitMerge {

	public static void main(String[] args) 
	{
		String str="hello@vova@heelo" ;
		
	String str1[] = 	str.split("@");
		
	for (int i=0; i<str1.length;i++)
		System.out.println(str1[i]);

String g = str.replace("e", "G");

System.out.println(g);

	}

}
