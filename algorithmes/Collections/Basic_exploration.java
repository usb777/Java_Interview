package algorithmes.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic_exploration {

	public static void main(String[] args) 
	{
	
		
		List<Integer> numbers =  new ArrayList<Integer>();
		List<Integer> numbers1=  new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		//numbers1 = numbers;
		numbers1.addAll(numbers); // main order
		System.out.println(numbers.toString());
		System.out.println("=========Shuffle=============");
		 Collections.shuffle(numbers);
		
		System.out.println(numbers.toString());
		System.out.println(numbers1.toString());
		
		
		Collections.sort(numbers);
		System.out.println("=========Sorting=============");
		System.out.println(numbers.toString());

	}

}
