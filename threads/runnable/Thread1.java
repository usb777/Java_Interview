package Threads.runnable;

public class Thread1 implements Runnable
	{
	public void run()
	{   
		try 
		{
			for (int i=0;i<3;i++)
			{
				Thread.sleep(400); // wait 1 sec
				printInt(i); 
			}
			
		} 
		catch (InterruptedException ie) {}
		
		System.out.println();
	}  
		
		 private  void printInt(int i) 
	      {
	    	  System.out.print("i"+i);
	      }	
		
		
		
	
	}



