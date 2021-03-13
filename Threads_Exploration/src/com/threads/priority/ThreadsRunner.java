package com.threads.priority;

/**
 
	Each thread have a priority. Priorities are represented by a number between 1 and 10. In most cases, 
thread schedular schedules the threads according to their priority (known as preemptive scheduling). 
But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

 */

public class ThreadsRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread1 t1 = new  Thread1();
		Thread2 t2 = new  Thread2();
		Thread3 t3 = new  Thread3();
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Thread.MIN_PRIORITY = "+Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY = "+Thread.NORM_PRIORITY);
		System.out.println("Thread.MAX_PRIORITY = "+Thread.MAX_PRIORITY);
		
		
	t1.start();

	try {
			t1.join();
		} catch (InterruptedException ie) { System.out.println(" exception = "+ie ) ;}
	
	t2.start();
	
	
	
	try {
		t2.join();
	} catch (InterruptedException ie) { System.out.println(" exception = "+ie ) ;}

	t3.start();
	try {
		t3.join();
	} catch (InterruptedException ie) { System.out.println(" exception = "+ie ) ;}


		

	}

}
