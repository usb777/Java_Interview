
public class ThreadFromRunnable implements Runnable
{
	public void run()
	{   try {
		for (int i=0;i<3;i++)
		{
			Thread.sleep(1000); // wait 1 sec
			System.out.println("thread is running from runnable..."); 
		}
	} 
	catch (InterruptedException ie) {}
	
	}  
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadFromRunnable r1= new ThreadFromRunnable();
		
		Thread t1 = new Thread(r1);
		
		t1.start();
	}

}
