package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetExp 
{

	public static void main(String[] args)
	{
		// Set has not contain dublicates
		Set<String> cars = new HashSet<String>();
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
	    
	    Set<Integer> setAdd = new HashSet<Integer>();
	    
	    setAdd   = addSetMembers();
	    setOutPut( setAdd );
	    
	}
	
	

	private static Set<Integer> addSetMembers()
	{
		long startTime = System.currentTimeMillis();  
		Set<Integer> set  = new HashSet<Integer>();
		for (int i=0; i<10000;i++)
		   {
			set.add(i);
		   }
		System.out.println("=============================================================");
		System.out.println("Time taken by members addition for Treeset "+(System.currentTimeMillis()-startTime)+"ms");
		System.out.println("=============================================================");
		
		 
		
	   return  set;	
	}
	
	
	
	
	
	
	private static void setOutPut(Set<Integer> set)
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
	
	private static void setOutPutString(Set<String> set)
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
