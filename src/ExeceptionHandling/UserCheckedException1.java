package ExeceptionHandling;

public class UserCheckedException1 
{
	public static void shaadicom() throws ChildMarriageException
	{
		int age=15;
		if(age>=20)
		{
			System.out.println("Able to get marry");
		}
		else
		{
			throw new ChildMarriageException("Invalid age");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			shaadicom();
		}
		catch(ChildMarriageException c)
		{
			System.out.println("Caught");
		}
	}
}
