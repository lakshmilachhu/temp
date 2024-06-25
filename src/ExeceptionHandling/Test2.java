package ExeceptionHandling;

public class Test2 
{
	public static void main(String[] args)
	{
		try
		{
			int a=1/0;
			System.out.println("Try block completely executed");
		}
		catch(ArithmeticException e)
		{
			System.err.println("Given input can't calculate");
		}
		finally
		{
			System.out.println("Without handling exception");
		}
	}

}
