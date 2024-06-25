package Assignment;

import java.util.Scanner;

public class Program12 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Limit");
		int a=scan.nextInt();
		
		int sub=0;
		System.out.println("enter the values for Subtraction");
		for(int i=1; i<=a; i++)
		{
			int n=scan.nextInt();
			sub=n-sub;
		}
		System.out.println("Subtraction of the values is " + sub);
		
		int add=0;
		System.out.println("enter the values for Addition");
		for(int j=1; j<=a; j++)
			{
			int m=scan.nextInt();
			add=m+add;
			}
		System.out.println("Addition of the values is " + add);
		
		int mul=1;
		System.out.println("enter the values for Multification");
		for(int k=1; k<=a;k++)
		{
			int p=scan.nextInt();
			mul=p*mul;
		}
		System.out.println("Multification of the values is " + mul);
		
		int div=1;
		System.out.println("enter the values for Division");
		for(int l=1; l<=a;l++)
		{
			int r=scan.nextInt();
			div=r/div;
		}
		System.out.println("Division of the values is " + div);
	}

}
