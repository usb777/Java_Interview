package algorithmes.Collections;

import java.util.Map;
import java.util.TreeMap;

public class Maps 
{

	
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(5, "vas");
		map.put(6, "as");
		map.put(1, "gas");
		map.put(7, "nas");
		map.put(3, "mas");
		map.put(2, "ias");
		
		System.out.println(map);
		
	}
	
	
}
