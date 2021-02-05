package Serialization.transients;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistTransient
{  
	 public static void main(String args[])throws Exception
	 {  
		  Student s1 = new Student(1,"Mr DZen",37,"male");//creating object  
		  //writing object into file  
		  FileOutputStream f=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(f);  
		  out.writeObject(s1);  
		  out.flush();  
		  
		  out.close();  
		  f.close();  
		  System.out.println("success");  
    }  
}  