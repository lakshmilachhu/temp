package ExeceptionHandling;

public class ExampleprintStackTrace 
{
	static void display3()
	{
//		double d=2.5/0;
//		System.out.println(d);
		int i=1/0;
	}
	static void display2()
	{
		display3();
	}
	static void display1()
	{
		display2();
	}
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		try
		{
			display1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}
}
