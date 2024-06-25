package Assignment;

public class Program4 {
	public static void main(String[] args)
	{
		System.out.println("1 to 10 from 100 using for loop");
		for(int a=1; a<=100; a++)
		{
			if(a>10)
			{
				break;
			}
			System.out.println(a);
		}
		System.out.println("1 to 10 from 100 using while loop");
		int b=1;
		while(b<=100)
		{
			if(b>10)
			{
				break;
			}
			System.out.println(b);
			b++;
		}
		System.out.println("1 to 10 from 100 using do-while loop");
		int c=1;
		do
		{
			if(c>10)
			{
				break;
			}
			System.out.println(c);
			c++;
		}
		while(c<=100);
		}
}

