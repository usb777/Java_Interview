package List;

/*
1) LinkedList internally uses a doubly linked list to store the elements.

2) Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, 
so no bit shifting is required in memory.

3)LinkedList class can act as a list and queue both because it implements List and Deque interfaces.

4)LinkedList is better for manipulating data.


*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class LinkedListExp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<String> cars = new LinkedList<String>();
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
	    
	    List<Integer> setAdd = new LinkedList<Integer>();
	    
	    setAdd   = addListMembers();
	    setOutPut( setAdd );

	}
	
	
	

	private static List<Integer> addListMembers()
	{
		long startTime = System.currentTimeMillis();  
		List<Integer> set  = new LinkedList<Integer>();
		for (int i=0; i<100000;i++)
		   {
			set.add(i);
		   }
		System.out.println("=============================================================");
		System.out.println("Time taken by members addition for LinkedList "+(System.currentTimeMillis()-startTime)+"ms");
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
