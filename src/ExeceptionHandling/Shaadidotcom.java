package ExeceptionHandling;

public class Shaadidotcom 
{
	public static void submit() throws ChildMarriageException
	{
		int age=10;
		if(age>=23)
		{
			System.out.println("Eligable for Marriage");
		}
		else
			throw new ChildMarriageException("Invalid age");
	}
	public static void main(String[] args)
	{
		try
		{
			submit();
		}
		catch(ChildMarriageException ch)
		{
			System.out.println(ch.getMessage());
		}
	}
}
