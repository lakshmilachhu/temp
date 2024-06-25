package Assignment;

import java.util.Scanner;

public class Program10 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		while(true) {  // it will execute infinite times 
		System.out.println("enter the value of A");
		int a=s.nextInt();
		System.out.println("enter the value of B");
		int b=s.nextInt();
		int res=a+b;
		System.out.println("addition of A and B is " + res);
		
		if(res==0)break;  // to avoid the infinite loops we've applied "if" condition.
		}
	}
	

}
