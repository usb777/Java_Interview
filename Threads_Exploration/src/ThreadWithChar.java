
public class ThreadWithChar extends Thread

{
	public void run()
	   {  char ch = 'a';
		for(int i=1;i<5;i++)
		{  
		    try{
		    	Thread.sleep(500);}
		    
		    catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(ch);  
		  }  
		}  


}
