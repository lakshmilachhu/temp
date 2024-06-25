package Assignment;

public class Program7 
{
	public static void main(String[] args)
	{
		System.out.println("using if statement");
		for(int a=1;a<=10;a++)
		{
			if(a%2!=0)
			{
				System.out.println(a);
			}
		}
		System.out.println("using if-else statement");
		System.out.println("***********************");
		for(int b=1;b<=10;b++)
		{
			if(b%2!=0)
			{
				System.out.println(b + " is odd number");
			}
			else
				System.out.println(b+ " is even number");
		}
		System.out.println("using ternary operator");
		System.out.println("***********************");
		int c=7;
		String num=(c%2!=0)? "even" : "odd" ;
		System.out.println(c + " is a " + num);
		System.out.println("using without conditional statement");
		System.out.println("***********************");
		for(int d=1;d<=10;d+=2)
		{
			System.out.println(d);
		}
		System.out.println("using continue");
		System.out.println("***********************");
		for(int e=1;e<=10;e++)
		{
			if(e%2==0)
			{
				continue;
			}
			System.out.println(e + " is a odd number");
		}
	}
}

		