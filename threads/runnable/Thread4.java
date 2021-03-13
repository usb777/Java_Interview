package Threads.runnable;

public class Thread4 implements Runnable
	{
	public void run()
	{   
		try 
		{
			for (int i=0;i<3;i++)
			{
				Thread.sleep(400); // wait 1 sec
				printChar() ;
				
			}
		} 
		catch (InterruptedException ie) {}
		System.out.println();
	}  
		
    private  void printChar() 
      {
    	  System.out.print("$");
      }	
	
    private  void printChar1() 
    {
  	  System.out.print("b");
    }	
    private  void printInt(int i) 
    {
  	  System.out.print("i"+i);
    }	
    
	}



