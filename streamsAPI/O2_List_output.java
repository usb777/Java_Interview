package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class O2_List_output {

	public static void main(String[] args) 
	{
		 List<Integer> list = new ArrayList<Integer>();
		 
         for(int i = 1; i< 10; i++)
         {
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         stream.forEach(p -> System.out.println(p));
         
        
        System.out.println("=================================");
         
         Stream<Integer> randomNumbers = Stream.generate( () -> (new Random()).nextInt(100));
     
             randomNumbers.limit(20)
                  .forEach(System.out::println);

	}

}
