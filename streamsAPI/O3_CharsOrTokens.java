package streamsAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class O3_CharsOrTokens {

	public static void main(String[] args) 
	{
		  IntStream stream = "12345_abcdefg".chars();
	        stream.forEach(p -> System.out.println(p));
	         
	    //OR
	         
	        Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
	        stream1.forEach(p -> System.out.print(p+"\r\n"));

	}

}
