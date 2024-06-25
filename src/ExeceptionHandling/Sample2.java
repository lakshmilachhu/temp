package ExeceptionHandling;

public class Sample2 
{
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		int[] arr= {10,20,30,40,50};
		// System.out.println(arr[8]); ==> ArrayIndexOutOfBoundsException
		try
		{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		System.out.println("Main ends");
	}

}
