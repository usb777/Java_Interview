package com.sycnronization.statics;

class Table
{  
	 synchronized static void printTable(int n)  // please remove static to see effect
	 {  
		   for(int i=1;i<=10;i++)
		   {  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(200);  
		     }catch(Exception e){}  
		   }  
	}  
}  