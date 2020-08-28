package Map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Map<Object,String> treemap = new TreeMap<Object,String>();
		treemap.put(1, "value");
		treemap.put(3, "value3");		
		treemap.put(9, "value9");
		treemap.put(7, "value7");
		
		mapOutPut(treemap);
		//Remove all data from Map
		treemap.clear();
		mapOutPut(treemap);

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
