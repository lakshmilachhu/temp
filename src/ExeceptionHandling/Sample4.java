package ExeceptionHandling;

public class Sample4 
{
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		try
		{
			int i=1/0;
			System.out.println("Hi"); // once exception occur this statement will not get execute
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception Handled"); 
		}
		catch(ArithmeticException e) //this catch block will execute
		{
			System.out.println("Arithmetic exception handled");
		}
		System.out.println("Main ends");
	}

}
