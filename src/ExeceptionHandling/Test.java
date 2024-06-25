package ExeceptionHandling;

public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		try
		{
			int i=1/0;
		}
		finally
		{
			System.out.println("I am finally block");
		}
		System.out.println("Main ends");
	}

}
