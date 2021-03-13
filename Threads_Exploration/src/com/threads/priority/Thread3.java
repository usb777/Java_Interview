package com.threads.priority;

public class Thread3 extends Thread
{

	public void run()
	   { 
		
		char ch = 'a';
		Thread.currentThread().setName("Thread3");
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		for(int i=1;i<5;i++)
		{  
		    try{
		    	Thread.sleep(500);
		    	//   Thread.yield();	
		    }
		 
		    catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(ch);  
		  }  
		}  
	
}
