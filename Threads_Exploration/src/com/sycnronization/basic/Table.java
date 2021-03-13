package com.sycnronization.basic;

class Table
{  
	 synchronized void printTable(int n)
	 {//synchronized method  
	   for(int i=1;i<=5;i++)
	   {  
	     System.out.println(n*i);  
	     try{  
	          Thread.sleep(200);  
	       }catch(Exception e){System.out.println(e);}  
	   }  //for
	  
	 }  //printTable
	 
	 synchronized void printTable(char n)
	 {//synchronized method  
	   for(int i=1;i<=5;i++)
	   {  
	     System.out.println(n);  
	     try{  
	          Thread.sleep(200);  
	       }catch(Exception e){System.out.println(e);}  
	   }  //for
	  
	 }  //printTable
} //Table