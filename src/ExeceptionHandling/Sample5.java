package ExeceptionHandling;

public class Sample5 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=2;
		try
		{
			int i=a/b;
			try
			{
				int[] arr= {5,10,15,20,25};
				System.out.println(arr[8]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Caught");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
	}
}
