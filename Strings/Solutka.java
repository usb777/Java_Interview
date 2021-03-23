package Strings;

import java.util.*;

interface MyList
{
 void convert(String[] a);
 void replace(int idx);	
 ArrayList<String> compact();
}


class InvalidStringException extends Exception
{
	public InvalidStringException()
	{
		super();
	}
	
} //class

class ArrayToList implements  MyList
{
	
	ArrayList<String> arrayToList;
	
	public ArrayToList() 
	{
		super();	
	}
	 

	public ArrayToList(ArrayList<String> arrayToList) 
	{
		super();
		this.arrayToList = arrayToList;
	}

	@Override
	public void convert(String[] a) 
	{
		for (int i=0;i<a.length;i++) 
		{
			arrayToList.add(a[i]);
			System.out.println("I have added the string: "+a[i]+" at the index: "+i);
		} //for
		
	}

	@Override
	public void replace(int idx) {
		
  arrayToList.set(idx, "");
	System.out.println("I have replaced the string: "+arrayToList.get(idx)+" with a null string");
	}

	@Override
	public ArrayList<String> compact() {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("");
		
		arrayToList.removeAll(ar);
		
		/*
		for (int i=0;i<arrayToList.size();i++)
		 {  if (arrayToList.get(i)=="")
			   arrayToList.remove(arrayToList.get(i));
		 }
		*/
		
		return arrayToList;
	}
	


public static int requestsServed(List<Integer> timestamp, List<Integer> top) 
{
	int counter = 0;
// Write your code here

  return counter;
}


}

