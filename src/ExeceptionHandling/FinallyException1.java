package ExeceptionHandling;

public class FinallyException1 
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException(); //no error
		}
		catch(ArithmeticException e)
		{
			throw new ArithmeticException(); //no error
		}
		finally
		{
			throw new ArithmeticException(); 
		}
		// System.out.println("Hello"); //CTE and Unreachable code
	}

}
