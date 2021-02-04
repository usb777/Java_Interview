package threads.basic;

public class ThreadFromThread extends Thread

{
	public void run()
	   {  
		for(int i=1;i<5;i++)
		{  
		    try{
		    	Thread.sleep(1000);
		    	System.out.println(i);  
		       }   catch(InterruptedException e)
		    
		    {System.out.println(e);		}  
		    
		    
		    
		  }  
		}  

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreadFromThread t1=new ThreadFromThread();  		
		 t1.start(); 		 

		
			 
	}

}
