package streamsAPI;
/*
 * https://howtodoinjava.com/java8/java-streams-by-examples/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class O5_Operations 
{

	public static void main(String[] args)	
	{
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Stream<List<String>> stream =  Stream.of(memberNames);
		stream.forEach(p -> System.out.println(p));
		 System.out.println("=================================");
		memberNames.stream().forEach(System.out::println);
		 System.out.println("===========Filtered======================");
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		 System.out.println("===========filtered UpperCase======================"); // MAP
		 memberNames.stream().filter((s) -> s.startsWith("S")).map(String::toUpperCase).forEach(System.out::println); 
		 System.out.println("=========== sorted======================"); // MAP
		 memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		 System.out.println("===========filtered sorted======================"); // MAP
		 memberNames.stream().filter((s) -> s.startsWith("S")).sorted().map(String::toUpperCase).forEach(System.out::println);
		 
		 
		 System.out.println("===========Match======================"); // MAP
		 
		 boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A")); //true
			 
			System.out.println(matchedResult);
			 
			matchedResult = memberNames.stream().allMatch( (s) -> s.contains("A")  );  //false
			 
			System.out.println(matchedResult);
			 
			matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A")); //false
			 
			System.out.println(matchedResult);
			
			 System.out.println("===========count======================"); // MAP
			long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
				 
				System.out.println(totalMatched);
			
			System.out.println("===========reduce======================"); // reduce
				 
			Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "-#-" + s2);
			 
			reduced.ifPresent(System.out::println);
			
			System.out.println("==========Circuit Breaking =Once======================"); // Once
			boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
			 
			System.out.println(matched);
		 
			System.out.println("==========Circuit Breaking =Find first======================"); // Once
			String firstMatchedName = memberNames.stream() .filter((s) -> s.startsWith("L")).findFirst() .get();
		 
		System.out.println(firstMatchedName);
		 
		 
		 
		 
		
	}

}
