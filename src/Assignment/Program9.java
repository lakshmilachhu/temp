package Assignment;

import java.util.Scanner;

public class Program9 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		/* String s="";
		System.out.println("Enter the numbers");
		for(int i=1; i<=5; i++)
		{
			int num=sc.nextInt();
			s=s+num+",";
		}
		System.out.println(s); */
		
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		System.out.println("Enter the values");
		String num="";
		for(int i=1; i<=limit; i++)
		{
			int n=sc.nextInt();
			num=num+n+",";
			
		}
		System.out.println("the numberes from the user is " + num);
	}

}
