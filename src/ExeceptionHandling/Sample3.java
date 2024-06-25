package ExeceptionHandling;

public class Sample3 
{
	public static void main(String[] args)
	{
		Sample3 s3=null;
		// System.out.println(s3.hashCode()); ==> NullPointerException

		try
		{
			System.out.println(s3.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
		}
	}

}
