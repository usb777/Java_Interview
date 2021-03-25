package jsonSample;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import jsonSample.model.User;



public class ReadJson  
{
	

	public static void main(String[] args) throws IOException
	{
		      
		 String urlString = "http://localhost:8085/genString";
	        
	
	    
	    	URL url = new URL(urlString);
		 
		  try (InputStream is = url.openStream();
		       JsonReader rdr = Json.createReader(is)) 
		  {
			  
			
		      JsonObject obj = rdr.readObject();
		      //System.out.println(obj.getJsonString("base") );
		      //System.out.println(obj.getJsonObject("coord"));
		      
		      System.out.println(obj.toString());	      
		      System.out.println("str:"+obj.get("str"));
		      
	          rdr.close();
	        
	          
				      
		 } catch (Exception e) 
		  {
			 e.printStackTrace();
		  }
		  
		  
		  
    
    }
	
	
}
