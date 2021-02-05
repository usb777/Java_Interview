package Serialization.transients;

import java.io.Serializable;

public class Student implements Serializable
{  
	 int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 transient String sex;
	 
	 public Student(int id, String name,int age, String sex) 
	 {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	  this.sex = sex;
	 }  
}  