package Map;

import java.util.Map;
import java.util.HashMap;

public class HashMapExp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Object,String> hashmap = new HashMap<Object,String>();
		hashmap.put(1, "value");
		hashmap.put(3, "value3");		
		hashmap.put(9, "value9");
		hashmap.put(7, "value7");
		
		
		System.out.println("HashMap size = " + hashmap.size());
		
		mapOutPut(hashmap);
		//Remove all data from Map
		hashmap.clear();
		mapOutPut(hashmap);

	}
	
	
	private static void mapOutPut(Map<Object,String> map)
	{
		//set = new TreeSet<Integer>();
		
		 
		  
		  long startTime = System.currentTimeMillis(); // catch time
		  
		  for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
		    
			System.out.println("=============================================================");
			System.out.println("Time taken by printing for TreeMap "+(System.currentTimeMillis()-startTime)+"ms");
			System.out.println("=============================================================");
		
	}
}