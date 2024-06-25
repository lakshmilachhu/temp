package ExeceptionHandling;

public class AmazonCheckedException 
{	
	public static void submit() throws AmazonException
		{
			int pant=1500;
			if(pant>=2000)
			{
				System.out.println("Getting discount");
			}
			else
			{
				throw new AmazonException("No discount");
			}
		}
		public static void main(String[] args)
		{
			try
			{
				submit();
			}
			catch(AmazonException a)
			{
				//System.out.println("Exception handled");
				System.out.println(a.getMessage());
			}
		}

}
