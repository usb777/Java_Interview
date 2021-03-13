package com.threads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolRunner
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	ExecutorService executor = Executors.newFixedThreadPool(4); //number of threads
	
	executor.execute(new PrintChar('a',10));
	executor.execute(new PrintChar('b',5));
	executor.execute(new PrintNum(5));
	
	executor.shutdown();
	}
	

}
