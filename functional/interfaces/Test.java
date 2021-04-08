package functional.interfaces;

import java.io.IOException;
import java.io.PrintWriter;

 interface MyFunctionalInterface
{
    public void execute();

    public static void doGet()
    {
    	  System.out.println("Hello");
    }
    
    public default void print(String text) 
    {
        System.out.println(text);
        
        
    }

    public static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}

public class Test implements MyFunctionalInterface {

	public static void main(String[] args) 
	{
		MyFunctionalInterface lambda = () -> {    System.out.println("Executing...");		};
		lambda.print("printus");
		
	}

	@Override
	public void execute() 
	{
		
		
	}

}
