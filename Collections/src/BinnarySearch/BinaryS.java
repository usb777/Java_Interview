package BinnarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryS {
	
	static  int binarySearch(int arr[], int x) 
	    { 
	        int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            // Check if x is present at mid 
	            if (arr[m] == x) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (arr[m] < x) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        // if we reach here, then element was 
	        // not present 
	        return -1; 
	    } 	
	
	
	

	public static void main(String[] args) 
	{
		   int arr[] = { 2, 3, 4, 10, 40 }; 
	        int n = arr.length; 
	        int x = 10; 
	        int result =binarySearch(arr, x); 
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at "  + "index " + result +";  arr["+result+"] = "+arr[result]); 
	        System.out.println("==============================================="); 
	        List<Integer> al = new ArrayList<Integer>(); 
	        al.add(1); 
	        al.add(2); 
	        al.add(3); 
	        al.add(10); 
	        al.add(20); 
	   
	        // 10 is present at index 3. 
	        int key = 10; 
	        int res = Collections.binarySearch(al, key); 
	        if (res >= 0) 
	            System.out.println(key + " found at index = " 
	                                                 + res); 
	        else
	            System.out.println(key + " Not found"); 
	  
	        key = 15; 
	        res = Collections.binarySearch(al, key); 
	        if (res >= 0) 
	            System.out.println(key + " found at index = "
	                                                  + res); 
	        else
	            System.out.println(key + " Not found");   
	        
	        

	}

}
