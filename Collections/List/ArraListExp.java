package List;

/*
 1) ArrayList internally uses a dynamic array to store the elements.
 
 2) Manipulation with ArrayList is slow because it internally uses an array. 
 If any element is removed from the array, all the bits are shifted in memory.
 
 3) An ArrayList class can act as a list only because it implements List only.
 
 4) ArrayList is better for storing and accessing data.
 
 
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class ArraListExp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW"); //doesnt show it
	    cars.add("Mazda");
/*
	    Iterator it = cars.iterator();
	    while(it.hasNext()) 
		{	  System.out.println(it.next());	}
	*/
	    setOutPutString(cars);
	    
	    List<Integer> setAdd = new ArrayList<Integer>();
	    
	    setAdd   = addListMembers();
	    setOutPut( setAdd );

	}
	
	
	

	private static List<Integer> addListMembers()
	{
		long startTime = System.currentTimeMillis();  
		List<Integer> set  = new ArrayList<Integer>();
		for (int i=0; i<100000;i++)
		   {
			set.add(i);
		   }
		System.out.println("=============================================================");
		System.out.println("Time taken by members addition for ArrayList "+(System.currentTimeMillis()-startTime)+"ms");
		System.out.println("=============================================================");
		
	   return  set;	
	}
	
	
	private static void setOutPut(List<Integer> set)
	{
		//set = new TreeSet<Integer>();
		
		  Iterator it = set.iterator();
		  
		  long startTime = System.currentTimeMillis(); // catch time
		    while(it.hasNext()) 
			{	  System.out.println(it.next());	}
		    
			System.out.println("=============================================================");
			System.out.println("Time taken by printing for Treeset "+(System.currentTimeMillis()-startTime)+"ms");
			System.out.println("=============================================================");
		
	}
	
	private static void setOutPutString(List<String> set)
	{
		//set = new TreeSet<Integer>();
		
		  Iterator it = set.iterator();
		  
		  long startTime = System.currentTimeMillis(); // catch time
		    while(it.hasNext()) 
			{	  System.out.println(it.next());	}
		    
			System.out.println("=============================================================");
			System.out.println("Time taken by printing for Treeset "+(System.currentTimeMillis()-startTime)+"ms");
			System.out.println("=============================================================");
		
	}

}
