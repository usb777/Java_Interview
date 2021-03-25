package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface OnlineAccount {
	int basePrice = 120;
	int regularMoviePrice = 45;
	int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> 
{

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfRegularMovies and noOfExclusiveMovies.
   
    public Account(String ownerName, int numberOfRegularMovies, int numberOfExclusiveMovies ) 
    {
		super();
		this.ownerName = ownerName;
		this.noOfRegularMovies = numberOfRegularMovies;
		this.noOfExclusiveMovies = numberOfExclusiveMovies;
	}
  


    // 2. This method returns the monthly cost for the account.
  
    public double monthlyCost() 
    {
        return basePrice+noOfRegularMovies*regularMoviePrice+noOfExclusiveMovies*exclusiveMoviePrice;
    }
    
	// 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    @Override
	public int compareTo(Account arg0) 
	{
    	if (monthlyCost()==arg0.monthlyCost() ) {return 0; }
    	else if (monthlyCost()<arg0.monthlyCost()) {return 1;}
    	else {return -1; }
	}
    
    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() 
    {
      return "Owner is "+ownerName+" and monthly cost is "+(int)monthlyCost()+" USD.";
    }

	
}

public class AccountSolution {

	public static void main(String[] args)
	{
		
		

	}

}
