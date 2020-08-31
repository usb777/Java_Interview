package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetExp {

	public static void main(String[] args) 
	{
		// Set has not contain dublicates
		Set<String> cars = new TreeSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    
		    Iterator it = cars.iterator();
		    while(it.hasNext()) 
			{	  System.out.println(it.next());	}
		
		// check set addition 
		    Set<Integer> setAdd = new TreeSet<Integer>();
		    
		    setAdd   = addSetMembers();
		    setOutPut( setAdd );
	}
	
	
	private static Set<Integer> addSetMembers()
	{
		long startTime = System.currentTimeMillis();  
		Set<Integer> set  = new TreeSet<Integer>();
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
