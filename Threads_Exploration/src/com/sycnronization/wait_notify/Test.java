package com.sycnronization.wait_notify;

 class Customer
{  
public int amount=10000;  
  
	synchronized void withdraw(int amount)
	{  
		System.out.println("going to withdraw...");  
  
		if(this.amount<amount)
		{  
			System.out.println("Less balance; waiting for deposit... balance ="+this.amount);  
			try{
				wait();  // thread wait
			 //System.out.println("operation completed");
			} // wait
			catch(Exception e){}  
        } //if
		
			this.amount-=amount;  
			System.out.println("withdraw completed...");  
    }  //withdaraw 
  
	synchronized void deposit(int amount)
	{  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... balance = "+this.amount);  
		notify();  //notify - alive thread
	}  
} //class Customer  
  
 public class Test
{  
	public static void main(String args[])
	{  
		final Customer c = new Customer();  
		
		new Thread()
		{  
			public void run()
			{c.withdraw(15000);}  
		}.start();  
		//System.out.println("=== Total amount is === " + c.amount);
		
		new Thread(){  
			public void run()
			{c.deposit(10000);}  
		}.start();  
		//System.out.println("=== Total amount is === " + c.amount);
    } //main
} //class	