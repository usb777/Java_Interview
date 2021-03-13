package com.threads.daemon;

public class Thread1 extends Thread
{

	
	public void run()
	   {  
		Thread.currentThread().setName("Thread1");
	
		
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work - "+Thread.currentThread().getName() +  "- numbers");  
			  }  
			  else{  
			  System.out.println("user thread work -"+Thread.currentThread().getName() +  "- numbers");  
			 }  
		
		
		for(int i=1;i<5;i++)
		{  
		    try{
		    	Thread.sleep(500);}
		    
		    catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		}  
	
	
}
