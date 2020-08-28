import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVERSUSLinkedList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
       
		long startTime = System.currentTimeMillis();  
        // place here algorithm
       
		List<Integer> arlist = new ArrayList<Integer>();
		
		for (int i=0; i<100000;i++)
		{	arlist.add(i);	}
		
		Iterator<Integer> it = arlist.iterator();
		while(it.hasNext()) 
		{	  System.out.println(it.next());	}
		System.out.println("=============================================================");
		System.out.println("Time taken by this algorithm for ArrayList "+(System.currentTimeMillis()-startTime)+"ms");
		System.out.println("=============================================================");
		
		
		startTime = System.currentTimeMillis();  
		
		List<Integer> linkedlist = new LinkedList<Integer>();
				
				for (int i=0; i<100000;i++)
				{	linkedlist.add(i);	}
				
				Iterator<Integer> it1 = linkedlist.iterator();
				while(it1.hasNext()) 
				{	  System.out.println(it1.next());	}
				
				System.out.println("=============================================================");
				System.out.println("Time taken by this algorithm for LinkedList "+(System.currentTimeMillis()-startTime)+"ms");
				System.out.println("=============================================================");
		
	}

}
