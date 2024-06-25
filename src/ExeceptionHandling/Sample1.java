package ExeceptionHandling;

public class Sample1 
{
	public static void main(String[] args)
	{
//		int a=10;
//		int b=0;
//		int c=a/b;    it will throw ArithmeticException
//		System.out.println(c);
		
		System.out.println("Main starts");
		try
		{
			int c=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Main ends");
	}

}
