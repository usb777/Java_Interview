package com.threads.daemon;
/**
 The join() method waits for a thread to die. 
 In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
 *
 */
public class DaemonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new  Thread1();
		Thread2 t2 = new  Thread2();
		Thread3 t3 = new  Thread3();
		
		
		t1.setDaemon(true);  
		t1.start(); // numbers		
		
		t2.start();  // #
		
		t3.start();  // a
		
	}

}
