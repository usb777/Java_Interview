package LinearSearch;

public class LinearSearch {
	
	
	
	
	private static boolean LS(int mt[], int key) 
	{
		for (int i=0; i<mt.length;i++)
		{
			if (mt[i]==key) 
			{return true;}
		} // for
		
		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {1,5,100,10,4} ; 
		
		System.out.println(LS(a,1010));

	}

}
