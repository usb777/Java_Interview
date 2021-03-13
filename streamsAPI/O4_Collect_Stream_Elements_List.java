package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class O4_Collect_Stream_Elements_List {

	public static void main(String[] args)
	{
		
		   List<Integer> list = new ArrayList<Integer>();
		   
	         for(int i = 1; i< 10; i++)
	         {
	             list.add(i);
	         }
	 
	         Stream<Integer> stream = list.stream();
	         List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
	         System.out.print(evenNumbersList);
		
		///////////////
	         
	         anotherWay();
	}
	
	public static void anotherWay()
	{
		 List<Integer> list = new ArrayList<Integer>();
		 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
        // stream.forEach(p -> System.out.println(p));
        
	}
	
	
	

}
