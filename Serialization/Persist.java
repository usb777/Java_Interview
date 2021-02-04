package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Persist
{  
	 public static void main(String args[])
	 {  
	  try
	  {  
	  //Creating the object  
		  Student s1 =new Student(1,"Dzmitry Samoila");  
	  //Creating stream and writing the object  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();   
		  out.close();  //closing the stream  
		  System.out.println("success");   
	  }
	  catch(Exception e){System.out.println(e);}  
	 }  
}  
