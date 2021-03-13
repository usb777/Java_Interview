package com.threads.daemon;

public class Thread2 extends Thread
{

	public void run()
	   { 
		
Thread.currentThread().setName("Thread2");
	
		
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work - "+Thread.currentThread().getName() +  "- # char");  
			  }  
			  else{  
			  System.out.println("user thread work  - "+Thread.currentThread().getName()+  "- # char");  
			 }  
		
		
		char ch = '#';
		 
	   
	   
	   
		for(int i=1;i<5;i++)
		{  
		    try{
		    	Thread.sleep(500);}
		    
		    catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(ch);  
		  }  
		}  
	
}
