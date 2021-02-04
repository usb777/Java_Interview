package threads.basic;

class AnotherThread implements Runnable
{
	@Override
	 public void run() 
	{
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) 
				{  e.printStackTrace();			}
			System.out.println("Hello "+i);
		}  // for
	} // run
}



public class ThreadFromRunnable implements Runnable
{
	synchronized public void run()
	{   try {
		for (int i=0;i<3;i++)
		{
			Thread.sleep(1000); // wait 1 sec
			System.out.println("thread is running from runnable..."); 
		}
	} 
	catch (InterruptedException ie) {}
	
	}  
	

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ThreadFromRunnable r1= new ThreadFromRunnable();
		
		Thread t1 = new Thread(r1);
		
		//t1.start();
		t1.join();
		
		AnotherThread t2 = new AnotherThread();
		AnotherThread t3 = new AnotherThread();
		Thread t22 = new Thread(t2);
		Thread t33 = new Thread(t3);
		t22.start();
		t22.join();
		
		t33.start();
		
	}

}
