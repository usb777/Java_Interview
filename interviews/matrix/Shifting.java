package interviews.matrix;

public class Shifting {

	public static void main(String[] args) 
	{
		int arr[]={0,22,4,0,0,1,0,8,0,6,0};

		int arr1[] = shiftZero(arr);
		
		System.out.println("=============");
			
		for(int i=0; i<arr1.length;i++)
		{
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\r\n====original array=====");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		
		int arr2[] = shiftZero1(arr);
		
		System.out.println("\r\n=====My props========");
		
		for(int i=0; i<arr1.length;i++)
		{
			System.out.print(arr1[i]+", ");
		}
		
	}
	
	public static int[] shiftZero(int[] arr)
	{
		int arr1[]=new int[arr.length];
		
			int j=0;
		
		for(int i=0; i<arr.length;i++)
		{	if (arr[i]!=0)  
			{
			       arr1[j] =  arr[i];
					j++;
			}
			else 
			{	arr1[arr.length-j-1] = 0;	}		
			System.out.print(arr[i]+", ");			
		}
		return arr1;
	}
	
	public static int[] shiftZero1(int[] arr)
	{
		
		int temp=0;
			int k=0;
		
		for(int i=0; i<arr.length;i++)
		{	if (arr[i]!=0)  
			{ 
			  temp = arr[i];
			    // arr[k] =  arr[i];
			  arr[k] =temp;
					k++;
			}			
		}
		
		for (int j=arr.length-k-1; j>0;j--)
		{
			arr[j] = 0;
		}
		
		
		return arr;
	}
	
	

}
