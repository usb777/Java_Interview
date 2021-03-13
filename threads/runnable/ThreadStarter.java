package Threads.runnable;

public class ThreadStarter 
{

	public static void main(String[] args) 
	{	
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
	
		t1.run();
		t2.run();
		t3.run();
		
		/*
		Thread1 t4 = new Thread1();
		t4.run();
		*/
	}

}
