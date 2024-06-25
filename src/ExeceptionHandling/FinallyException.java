package ExeceptionHandling;

public class FinallyException 
{
	public static void main(String[] args)
	{
		try
		{
		}
		finally
		{
			throw new ArithmeticException("Hello");
		}
		//System.out.println("hi"); CTE
	}
}
