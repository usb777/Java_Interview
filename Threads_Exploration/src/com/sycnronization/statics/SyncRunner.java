package com.sycnronization.statics;

public class SyncRunner
{
	public static void main(String args[])

	{  
		MyThread1 t1=new MyThread1();  
		MyThread2 t2=new MyThread2();  
		MyThread3 t3=new MyThread3();  
		
		t1.start();  
		t2.start();  
		t3.start();  
	}  
} //class  