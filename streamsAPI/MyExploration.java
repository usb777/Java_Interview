package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class MyExploration {

	public static  void main(String[] args) 
	{
		List<String>  arList = new ArrayList<String>();
		
		arList.add("vfsdsa");
		arList.add("bbsadas");
		arList.add("abc");
		arList.add("zzs");
		
		
		
		
		Stream<String> stream = arList.stream();
		 
		stream.map(x->"AAA"+x).sorted().forEach(System.out::println);
		StringTokenizer st = new StringTokenizer("sdfsdf dsf dfd   dds");
		
		System.out.println(st.countTokens());
           
	}

}
