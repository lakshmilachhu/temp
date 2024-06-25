package Assignment;

public class Program8 
{
	public static void main(String[] args)
	{
		for(int a=3; a<=100; a+=10)
		{
		 System.out.println(a);
		}
		System.out.println("****************");
		for(int b=1; b<=100; b++)
		{
			if(b%10==3)
			{
				System.out.println(b);
			}
		}
		System.out.println("***********************");
		int c=1;
		boolean result =(c%10==3)? true: false;
		System.out.println(result);
	}

}
