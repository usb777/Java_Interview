/**
 * Calculate Length using Pythagorean Theorem
 * (square of( x to the power of 2 + y to the power of 2) 
 * 
 * using floating point and double
 * @author MrDzen
 *
 */
public class Pifagor
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" Length = " +Pifagor(3,4));
	}
	
	
	static double Pifagor(double x, double y)
	{
		double Length = 0;
		try 
		{
			Length = Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2) ) ; 
		}
		catch (NullPointerException npe) 
		{
			npe.printStackTrace();
		}
		
		return Length;
	}

}
